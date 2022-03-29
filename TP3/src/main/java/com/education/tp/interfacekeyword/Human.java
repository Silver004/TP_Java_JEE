package com.education.tp.interfacekeyword;

public class Human extends Animal implements Carnivore, Herbivore{
    @Override
    public void eat(Animal animal){}
    public void eat(Vegetable vegetable){}

}
