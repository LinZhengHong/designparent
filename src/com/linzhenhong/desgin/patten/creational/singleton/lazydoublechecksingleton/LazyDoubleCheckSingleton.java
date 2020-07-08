package com.linzhenhong.desgin.patten.creational.singleton.lazydoublechecksingleton;

/**
 * 懒汉式-双重检查
 * @author LinZhenHong
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton=null;
    private LazyDoubleCheckSingleton(){

    }

    /**
     * 为了保证线程安全，加上Synchronized同步锁,同时避免消耗过多内存
     * @return LazySingleton
     */
    public static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton==null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton==null){
                    lazyDoubleCheckSingleton=new LazyDoubleCheckSingleton();
                    //1.分配内存给这个对象
                    //2.初始化这个对象
                    //3.设置instance指向分配的内存空间
                    /*在单线程中 重排序是没有问题的，也就是下面这种情况
                    * 1.分配内存给这个对象
                    * 3.设置instance指向分配的内存空间
                    2.初始化这个对象
                    *
                    * 但在多线程中，会出现获取不到这个初始化对象，解决方法有两种：
                    * 1.防止重排序 volatile
                    * 2.内部类封装起来
                    *  */

                }
            }
        }
        return lazyDoubleCheckSingleton ;
    }

}
