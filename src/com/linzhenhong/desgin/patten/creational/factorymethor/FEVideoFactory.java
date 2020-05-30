package com.linzhenhong.desgin.patten.creational.factorymethor;

public class FEVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
