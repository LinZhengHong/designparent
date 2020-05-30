package com.linzhenhong.desgin.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class TempLeader {
    public void checkNumberOfCourse(){
        List<Course> courses=new ArrayList<>();
        for(int i=0;i<20;i++){
            courses.add(new Course());
        }
        System.out.println("在线课程为"+courses.size());
    }
}
