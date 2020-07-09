package com.linzhenhong.desgin.patten.creational.singleton.threadsingleton;

/**
 *线程单例
 * @author LinZhenHong
 */
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstance
            =new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue(){
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance(){

    }

    private static ThreadLocalInstance getInstance(){
        return threadLocalInstance.get();
    }
}
