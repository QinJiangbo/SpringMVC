package com.qinjiangbo.service;

import com.qinjiangbo.gen.dao.SysUserMapper;
import com.qinjiangbo.gen.model.SysUser;
import com.qinjiangbo.gen.model.SysUserExample;
import com.qinjiangbo.util.LocalCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Richard on 6/21/16.
 */
@Service
public class SysUserService extends LocalCache<Long, SysUser>{

    @Autowired
    private SysUserMapper sysUserMapper;

    /**
     * initialize the local cache object
     */
    public SysUserService() throws IOException {
    }

    /**
     * get user info
     * @param userId
     * @return
     */
    public SysUser findSysUser(Long userId) {
        return this.getObject(userId);
    }

    /**
     * get user info in batch mode
     * @param userIds
     * @return
     */
    public List<SysUser> findSysUsers(List<Long> userIds) {
        return this.getObjects(userIds);
    }

    @Override
    public SysUser makeObject(Long key) {
        return sysUserMapper.selectByPrimaryKey(key);
    }

    @Override
    public Map<Long, SysUser> makeObjects(List<Long> keys) {
        SysUserExample sysUserExample = new SysUserExample();
        sysUserExample.createCriteria().andUserIdIn(keys);
        List<SysUser> sysUserList = sysUserMapper.selectByExample(sysUserExample);
        Map<Long, SysUser> map = new HashMap<Long, SysUser>();
        for (SysUser sysUser : sysUserList) {
            map.put(sysUser.getUserId(), sysUser);
        }
        return map;
    }
}
