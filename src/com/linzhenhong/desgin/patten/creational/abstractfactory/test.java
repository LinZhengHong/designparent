package com.linzhenhong.desgin.patten.creational.abstractfactory;

/**
 * @author LinZhenHong
 */
public class test {
    public static void main(String[] args) {
        CourseFactory courseFactory=new JavaCourseFactory();
        Video video=courseFactory.getVideo();
        Article article=courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
