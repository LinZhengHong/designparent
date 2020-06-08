package com.linzhenhong.desgin.patten.creational.singleton;

/**学习了怎么多线程debug
 * @author LinZhenHong
 */
public class LazySingleton {

    private static LazySingleton lazySingleton=null;
    private LazySingleton(){

    }

    /**
     * 为了保证线程安全，加上Synchronized同步锁
     * @return LazySingleton
     */
    public synchronized static LazySingleton getInstance(){
        if(lazySingleton==null){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }

}
