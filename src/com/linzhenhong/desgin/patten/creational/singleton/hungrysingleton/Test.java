package com.linzhenhong.desgin.patten.creational.singleton.hungrysingleton;

import java.io.*;


/**
 * 序列化破坏单例模式
 * @author LinZhenHong
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        HungrySingleton instance=HungrySingleton.getInstance();
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("singleton_file"));
        objectOutputStream.writeObject(instance);


        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("singleton_file"));
        HungrySingleton newInstance=(HungrySingleton) objectInputStream.readObject();


        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance==newInstance);
    }
}
