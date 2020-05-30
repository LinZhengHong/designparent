package com.linzhenhong.desgin.principle.demeter;

public class Boss {
    public void commandCheckCourse(TempLeader leader){
        leader.checkNumberOfCourse();
    }
}
