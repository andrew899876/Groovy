package com.andrew

class Sparrow extends Bird implements Flyable{
    public Sparrow(int age, String gender, int weight){
        super(age, gender, weight);
    }

    @Override
    void fly() {
        println("Sparrow flying high");
    }
}
