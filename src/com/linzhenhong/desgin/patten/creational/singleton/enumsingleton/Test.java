package com.linzhenhong.desgin.patten.creational.singleton.enumsingleton;

import com.linzhenhong.desgin.patten.creational.singleton.hungrysingleton.HungrySingleton;

import java.io.*;

/**
 * 序列化破坏防御的场景
 * @author LinZhenHong
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        EnumInstance instance=EnumInstance.getInstance();
        instance.setData(new Object());
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("singleton_file"));
        objectOutputStream.writeObject(instance);


        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("singleton_file"));
        EnumInstance newInstance=(EnumInstance) objectInputStream.readObject();


        System.out.println(instance.getData());
        System.out.println(newInstance.getData());
        System.out.println(instance.getData()==newInstance.getData());
    }
}
