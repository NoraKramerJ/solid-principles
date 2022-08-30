package com.cydeo.solid.interfaceSegregation.example.good;

public class Chicken implements Walk,Eat{


    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void walk() {
        System.out.println("walking");
    }
}
