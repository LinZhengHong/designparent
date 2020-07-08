package com.linzhenhong.desgin.patten.creational.singleton.lazydoublechecksingleton;

public class T implements Runnable {
    @Override
    public void run() {
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getContextClassLoader()+" "+" lazyDoubleCheckSingleton");
    }
}
