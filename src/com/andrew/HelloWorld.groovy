package com.andrew
import groovy.xml.MarkupBuilder;

class HelloWorld {

    static void main(String[] args){
        Chicken chick1 = new Chicken(6, "Female", 56);

        Object sparrow1 = new Sparrow(4, "Male", 34);

        Object fish1 = new Fish(3, "Male", 45);
        moveAnimal(fish1);
        moveAnimal(sparrow1);
    }

    public static void moveAnimal(Object animal){
        animal.move();
    }
}
