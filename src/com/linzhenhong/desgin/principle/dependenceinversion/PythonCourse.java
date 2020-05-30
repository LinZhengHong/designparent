package com.linzhenhong.desgin.principle.dependenceinversion;

public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
            System.out.println("他学习Python");
    }
}
