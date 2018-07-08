package com.andrew
import groovy.xml.MarkupBuilder;

class HelloWorld {
    int x;

    public int getX(){
        return x;
    }

    public void setX(int pX){
        this.x = pX;
    }
    static void main(String[] args){
        HelloWorld hello = new HelloWorld()
        hello.setX(40);
        println(hello.getX());
    }
}
