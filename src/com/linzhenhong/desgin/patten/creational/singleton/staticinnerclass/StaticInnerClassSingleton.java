package com.linzhenhong.desgin.patten.creational.singleton.staticinnerclass;

public class StaticInnerClassSingleton {


    /**
     * 为了防止反射进入到这里进行修改（防御）
     */
    private StaticInnerClassSingleton() {
        if(InnerClass.staticInnerClassSingleton!=null){
            throw new RuntimeException("单例构造器防止被反射调用");
        }
    }

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
