package com.linzhenhong.desgin.principle.dependenceinversion;

import jdk.jfr.StackTrace;
import org.junit.Test;

public class test {

   /* public static void main(String[] args) {
        //v1
        studentLover studentLover=new studentLover();
        studentLover.studyJavaCourse();
        studentLover.studyPythonCourse();
        studentLover.studyGoCourse();
    }*/

    /*public static void main(String[] args) {
        //v2
        studentLover studentLover=new studentLover();
        studentLover.studyCourse(new JavaCourse());
        studentLover.studyCourse(new PythonCourse());
        studentLover.studyCourse(new GoCourse());
    }*/

    /*public static void main(String[] args) {
        //v3
        studentLover studentLover=new studentLover(new JavaCourse());
        studentLover.studyCourse();
    }*/

    public static void main(String[] args) {
        //v4
        studentLover studentLover=new studentLover();
        studentLover.setiCourse(new JavaCourse());
        studentLover.studyCourse();
        studentLover.setiCourse(new PythonCourse());
        studentLover.studyCourse();
    }

}
