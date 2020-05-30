package com.linzhenhong.desgin.patten.creational.builder;

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder=new CourseAbstractBuilder();
        Coach coach=new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course=coach.makeCourse("Java设计模式",
                "Java设计模式PPT",
                "Java设计模式视频",
                "Java设计模式手记",
                "javaQA");

        System.out.println(course);
    }
}
