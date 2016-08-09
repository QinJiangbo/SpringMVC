package com.qinjiangbo.util;

import org.springframework.util.StringUtils;

/**
 * Created by Richard on 8/8/16.
 */
public class DataUtils {

    public static Long toLong(Object value) {
        if (value == null)
            return 0L;
        if (value instanceof Integer) {
            return Long.valueOf(value.toString());
        }
        if (value instanceof Long) {
            return (Long) value;
        }
        if (value instanceof String) {
            if (StringUtils.isEmpty((String) value)){
                return 0L;
            }
            try {
                return Long.valueOf(value.toString());
            } catch (Exception e) {
                return 0L;
            }
        }
        return 0L;
    }

    public static Integer toInt(Object value) {
        if (value == null) {
            return 0;
        }
        if (value instanceof Integer) {
            return (Integer) value;
        }
        if (value instanceof String) {
            if (StringUtils.isEmpty((String) value)) {
                return 0;
            }
            try {
                return Integer.valueOf(value.toString());
            }catch (Exception e) {
                return 0;
            }
        }
        return 0;
    }
}
