package com.linzhenhong.desgin.patten.creational.simplefactory;

public class test {
    public static void main(String[] args) throws Exception {
        VideoFactory videoFactory=new VideoFactory();
        /*Video video=videoFactory.getVideo("java");*/
        Video video=videoFactory.getVideo(JavaVideo.class);
        if (video==null){
            return;
        }
        video.produce();
    }
}
