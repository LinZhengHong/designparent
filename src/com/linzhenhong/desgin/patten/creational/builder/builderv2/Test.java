package com.linzhenhong.desgin.patten.creational.builder.builderv2;

public class Test {
    public static void main(String[] args) {
        Course course=new Course.CourseBuilder().buildCourseName("Java设计模式")
                                                .buildCoursePPT("Java ppt")
                                                .buildCourseVideo("Java视频")
                                                .buildCourseArticle("Java手记")
                                                .buildCourseQA("Java QA").build();
        System.out.println(course);
    }
}
