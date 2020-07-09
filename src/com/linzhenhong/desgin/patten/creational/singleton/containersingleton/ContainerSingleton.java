package com.linzhenhong.desgin.patten.creational.singleton.containersingleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器单例
 * @author LinZhenHong
 */
public class ContainerSingleton {
    private static Map<String,Object> singletonMap=new HashMap<>();

    public ContainerSingleton() {
    }


    /*public static void putInstance(String key,Object instance){
        if(StringUtil.isNotBlank(key)){
            singletonMap.put(key,instance);
        }
    }*/

    public static Object getInstance(String key){
        return singletonMap.get(key);
    }
}
