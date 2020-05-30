package com.linzhenhong.desgin.principle.dependenceinversion;

public class studentLover {

    private ICourse iCourse;

    /*public studentLover(ICourse iCourse) {
        this.iCourse = iCourse;
    }*/

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse(){
        iCourse.studyCourse();
    }

    /*public void studyJavaCourse(){
        System.out.println("他学习了java课程");
    }
    public void studyPythonCourse(){
        System.out.println("他学习了python课程");
    }
    public void studyGoCourse(){
        System.out.println("他学习了Go课程");
    }*/
}
