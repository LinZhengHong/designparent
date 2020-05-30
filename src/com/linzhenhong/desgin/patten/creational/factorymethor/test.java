package com.linzhenhong.desgin.patten.creational.factorymethor;

public class test {
    public static void main(String[] args) throws Exception {
        VideoFactory videoFactory=new JavaVideoFactory();
        Video video=videoFactory.getVideo();
        video.produce();
    }
}
