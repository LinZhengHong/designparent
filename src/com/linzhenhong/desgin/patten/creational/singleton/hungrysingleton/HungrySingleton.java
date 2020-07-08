package com.linzhenhong.desgin.patten.creational.singleton.hungrysingleton;

/**
 * 饿汉式,在类加载时就创建对象
 */
public class HungrySingleton {
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton=new HungrySingleton();
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
