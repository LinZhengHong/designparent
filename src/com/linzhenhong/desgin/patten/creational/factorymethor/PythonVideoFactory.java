package com.linzhenhong.desgin.patten.creational.factorymethor;

public class PythonVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
