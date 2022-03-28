package com.education.tp.abstractkeyword;

public class Triangle  extends  GeoFormTypeA{
    double height;
    double base;
    @Override
    public double calculateSurface(){
        return (height * base)/2;
    }
}
