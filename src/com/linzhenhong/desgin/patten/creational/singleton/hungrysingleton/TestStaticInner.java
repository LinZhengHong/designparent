package com.linzhenhong.desgin.patten.creational.singleton.hungrysingleton;

import com.linzhenhong.desgin.patten.creational.singleton.staticinnerclass.StaticInnerClassSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 解决反射攻击单例模式--静态内部类（类加载）
 * @author LinZhenHong
 */
public class TestStaticInner {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class ObjectClass= StaticInnerClassSingleton.class;
        Constructor constructor =ObjectClass.getDeclaredConstructor();
        //通过反射打开构造器的权限
        constructor.setAccessible(true);
        StaticInnerClassSingleton instance=StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton newInstance=(StaticInnerClassSingleton) constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance==newInstance);

    }
}
