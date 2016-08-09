package com.qinjiangbo.util;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Richard on 7/30/16.
 */
public abstract class LocalCache<K, V> {

    // record the logs
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private volatile Ehcache ehcache = null;
    private static CacheManager cacheManager;

    /**
     * static method to load configuration
     */
    private static void init() throws IOException {
        cacheManager = CacheManager.create(LocalCache.class.getClassLoader().getResourceAsStream("ehcache.xml"));
    }

    /**
     * initialize the local cache object
     */
    public LocalCache() throws IOException {
        synchronized (LocalCache.class) {
            if (LocalCache.cacheManager == null) {
                LocalCache.init();
            }
        }
        ehcache = cacheManager.addCacheIfAbsent(this.getClass().getName());
        logger.info(this.getClass().getName() + " added to cache!");
    }

    public abstract V makeObject(K key);

    /**
     * default method, if you want to use it, cover it by overwriting this method
     * @param keys
     * @return
     */
    public Map<K, V> makeObjects(List<K> keys) {
        return null;
    }

    /**
     * notify cache to update
     * @param key
     */
    public void removeObject(K key) {
        ehcache.remove(key, true);
    }

    /**
     * notify other caches to update
     * @param key
     * @param value
     */
    public void addObject(K key, V value) {
        removeObject(key);
        ehcache.putIfAbsent(new Element(key, value), false);
    }

    /**
     * close the cache
     */
    public synchronized void close() {
        cacheManager.removeCache(this.getClass().getName());
        String[] names = cacheManager.getCacheNames();
        // no using cache, shut down directly
        if(names == null || names.length == 0) {
            cacheManager.shutdown();
            cacheManager = null;
        }
    }

    /**
     * get single object from the cache,
     * if no object found, then load the date from database
     * @param key
     * @return
     */
    public V getObject(final K key) {
        long startTime = System.currentTimeMillis();
        V object = null;
        Element element = ehcache.get(key);
        if(element != null) {
            // load data from cache
            object = (V) element.getObjectValue();
            long endTime = System.currentTimeMillis();
            logger.info(this.getClass().getName() + " loads data from cache in " + (endTime - startTime) + "ms");
        } else {
            // load data from database
            object = makeObject(key);
            addObject(key, object);
            long endTime = System.currentTimeMillis();
            logger.info(this.getClass().getName() + " loads data from database in " + (endTime - startTime) + "ms");
        }
        return object;
    }

    /**
     * load data in batch
     * @param keys
     * @return
     */
    public List<V> getObjects(final List<K> keys) {
        long startTime = System.currentTimeMillis();
        if (keys == null || keys.size() == 0) {
            return null;
        }
        // first get the data in cache
        List<K> keysInCache = new ArrayList<K>();
        for (K key : keys) {
            if (ehcache.isKeyInCache(key)) {
                keysInCache.add(key);
            }
        }
        Map<Object, Element> map = ehcache.getAll(keysInCache);
        List<V> list = map2List(map);
        if(list != null && list.size() == keys.size()) {
            // load data from cache
            long endTime = System.currentTimeMillis();
            logger.info(this.getClass().getName() + " loads batch data from cache in " + (endTime - startTime) + "ms");
        }
        else {
            // get keys not in cache
            keys.removeAll(keysInCache);
            // load data from database
            Map<K, V> resultMap = makeObjects(keys);
            Set<Map.Entry<K, V>> entrySet = resultMap.entrySet();
            for (Map.Entry<K, V> entry : entrySet) {
                addObject(entry.getKey(), entry.getValue());
                list.add(entry.getValue());
            }
            long endTime = System.currentTimeMillis();
            logger.info(this.getClass().getName() + " loads batch data from database in " + (endTime - startTime) + "ms");
        }
        return list;
    }

    /**
     * convert map to list
     * @param map
     * @return
     */
    private List<V> map2List(Map<Object, Element> map) {
        if(map == null || map.size() == 0) {
            return null;
        }
        List<V> list = new ArrayList<V>();
        Set<Map.Entry<Object, Element>> entrySet = map.entrySet();
        for (Map.Entry<Object, Element> entry : entrySet) {
            if(entry.getValue() == null) {
                continue;
            }
            list.add((V)entry.getValue().getObjectValue());
        }
        return list;
    }

}
