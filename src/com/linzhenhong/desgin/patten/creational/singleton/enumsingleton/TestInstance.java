package com.linzhenhong.desgin.patten.creational.singleton.enumsingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ConcurrentModificationException;

/**
 * 反射破坏防御的场景
 * @author LinZhenHong
 */
public class TestInstance {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objectClass=EnumInstance.class;
        Constructor constructor=objectClass.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);
        EnumInstance instance=(EnumInstance) constructor.newInstance("linzhenghong","25");
        
        System.out.println(instance);
    }
}
