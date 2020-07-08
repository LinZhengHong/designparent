package com.linzhenhong.desgin.patten.creational.singleton.staticinnerclass;

public class StaticInnerClassSingleton {
    /**
     * 静态内部类
     */
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton=new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }

}
