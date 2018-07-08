package com.andrew

class Fish extends Object{

    public Fish(int age, String gender, int weight){
        super(age,gender,weight);
    }


    void move() {
        println("Fish is swimming");
    }

    public void swim(){
        println("Swimming...");
    }
}
