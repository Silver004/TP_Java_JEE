package com.education.tp.abstractkeyword;

public abstract class GeometricForm {
    double surface;
    public abstract double calculateSurface();
    public void printSurface(){
        System.out.println(this.surface);
    }
}
