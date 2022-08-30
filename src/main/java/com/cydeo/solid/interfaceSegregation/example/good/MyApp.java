package com.cydeo.solid.interfaceSegregation.example.good;

import java.util.ArrayList;
import java.util.List;

public class MyApp {

    public static void main(String[] args) {

        ArrayList<Fly> birds=new ArrayList<>();
        birds.add(new Eagle());
        birds.add(new Owl());
     //   birds.add(new Chicken)); compiler says that chicken can not fly.
        letBirdsFly(birds);
    }
    public static void letBirdsFly(List<Fly> birds){
        for (Fly bird : birds) {
            bird.fly();// does nothing for chicken
        }
    }
}
