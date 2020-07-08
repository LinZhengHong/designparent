package com.linzhenhong.desgin.patten.creational.singleton.hungrysingleton;

import java.io.Serializable;

/**
 * 饿汉式,在类加载时就创建对象
 */
public class HungrySingleton implements Serializable {
    private final static HungrySingleton hungrySingleton;
    static {
        hungrySingleton=new HungrySingleton();
    }

    /**
     * 为了防止反射进入到这里进行修改（防御）
     */
    private HungrySingleton() {
        if (hungrySingleton!=null){
            throw new RuntimeException("单例构造器禁止被反射调用");
        }
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    /**
     * 防止序列化破坏单例模式
     * @return
     */
    private Object readResolve(){
        return hungrySingleton;
    }
}
