package com.company;

public class Bird  {
    private String color;
     void fly(){
        System.out.print("I can ");
    }

    Bird(){}
    public Bird(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

     void setColor(String color) {
        this.color = color;
    }
}
