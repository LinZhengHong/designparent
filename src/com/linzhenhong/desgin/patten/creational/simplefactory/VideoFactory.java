package com.linzhenhong.desgin.patten.creational.simplefactory;

public class VideoFactory {
    public Video getVideo(Class c) throws Exception {
        Video video=null;
        video=(Video) Class.forName(c.getName()).getDeclaredConstructor().newInstance();
        return video;


        /*if ("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if ("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }else {
            return null;
        }*/
    }
}
