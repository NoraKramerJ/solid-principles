package com.cydeo.solid.interfaceSegregation.example.good;

public class Owl implements Fly,Walk,Eat {


    @Override
    public void eat() {
        System.out.println("Eating");
    }


    @Override
    public void walk() {
        System.out.println("walking");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
