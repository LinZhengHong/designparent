package com.linzhenhong.desgin.patten.creational.singleton.staticinnerclass;



public class T implements Runnable {
    @Override
    public void run() {
        /*LazySingleton lazySingleton= LazySingleton.getInstance();*/
        StaticInnerClassSingleton staticInnerClassSingleton=StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getContextClassLoader()+" "+"StaticInnerClassSingleton");
    }
}
