package com.education.tp.abstractkeyword;

public class Test {
    public static void main(String[] args){
        //GeometricForm f1 = new GeometricForm();
        //GeometricForm f2 = new GeoFormTypeA();
        GeometricForm f3 = new Triangle();
        GeometricForm f4 = new GeometricForm() {
            @Override
            public double calculateSurface() {
                return 22;
            }
        };
    }
}
