package com.linzhenhong.desgin.patten.creational.singleton;

public class T implements Runnable {
    @Override
    public void run() {
        LazySingleton lazySingleton=LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getContextClassLoader()+" "+"LazySingleton");
    }
}
