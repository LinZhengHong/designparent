package com.linzhenhong.desgin.patten.creational.singleton.lazysingleton;

/**单例模式——懒汉式
 * @author LinZhenHong
 */
public class LazySingleton {

    private static LazySingleton lazySingleton=null;
    private LazySingleton(){
        if (lazySingleton!=null){
            throw new RuntimeException("单例构造禁止被反射调用");
        }
    }

    /**
     * 为了保证线程安全，加上Synchronized同步锁，单线程是没问题，多线程就有问题
     * @return LazySingleton
     */
    public static LazySingleton getInstance(){
        if(lazySingleton==null){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }
}
