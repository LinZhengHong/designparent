package com.linzhenhong.desgin.patten.creational.singleton.hungrysingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *解决反射攻击单例模式（类加载）
 * @author LinZhenHong
 */
public class TestInstance {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class objectClass=HungrySingleton.class;
        Constructor constructor =objectClass.getDeclaredConstructor();
        //通过反射打开构造器的权限
        constructor.setAccessible(true);
        HungrySingleton instance=HungrySingleton.getInstance();
        HungrySingleton newInstance=(HungrySingleton) constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance==newInstance);

    }
}
