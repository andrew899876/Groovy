package com.andrew

abstract class Object {
    private String gender;
    private int age;
    private int weight;

    public Object(int age, String gender, int weight){
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public void speak(){
        println("Hello, my name is " + name);
        println("I am " + age + " Years old");
        println("I am " + height + " inches tall");
        print("My eye colour is " + eyeColour);
    }

    public void eat(){
        println("I am eating delicious food");
    }

    public void walk(){
        println("I am walking just like a animal")
    }

    public abstract void move();
}
