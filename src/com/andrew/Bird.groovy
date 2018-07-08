package com.andrew

class Bird extends Object{

    public Bird(int age, String gender, int weight){
        super(age, gender, weight);
    }


    void move() {
        println("Bird is flapping wings");
    }
}
