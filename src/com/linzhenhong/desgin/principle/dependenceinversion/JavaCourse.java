package com.linzhenhong.desgin.principle.dependenceinversion;

public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("他在学习java");
    }
}
