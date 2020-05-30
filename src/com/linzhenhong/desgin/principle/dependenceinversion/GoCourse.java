package com.linzhenhong.desgin.principle.dependenceinversion;

public class GoCourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("他学习Go");
    }
}
