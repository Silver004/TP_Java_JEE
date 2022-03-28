package com.education.tp4;

public class TestReflectionAnnotation {
    public static void main(String[] args){
        Class c = MathCalculator.class;
        Programmer programmer =(Programmer) c.getAnnotation(Programmer.class);
        System.out.println(programmer.id() + " : " + programmer.name());
    }
}
