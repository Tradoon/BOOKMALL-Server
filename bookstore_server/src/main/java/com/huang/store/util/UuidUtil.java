package com.huang.store.util;

import java.util.UUID;

/**
 * @author: tradoon
 * @date: 2022
 * @description:UUID工具类
 */
public final class UuidUtil {
    private UuidUtil(){}
    public static String getUuid(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
