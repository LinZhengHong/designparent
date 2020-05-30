package com.linzhenhong.desgin.principle.openclose;

public class test {
    public static void main(String[] args) {
        ICourse javaCourse=new DiscountCourse(12,"java从入门到入土",98.0);
        DiscountCourse iCourse=(DiscountCourse) javaCourse;
        System.out.println("课程号为:"+iCourse.getId()+"   课程名字为:"+iCourse.getName()+" 打折课程价格:"+iCourse.getPrice()+" 课程价格为:"+iCourse.getoldPrice());
    }
}
