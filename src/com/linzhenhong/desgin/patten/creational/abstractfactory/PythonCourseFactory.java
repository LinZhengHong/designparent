package com.linzhenhong.desgin.patten.creational.abstractfactory;

/**
 * @author LinZhenHong
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
