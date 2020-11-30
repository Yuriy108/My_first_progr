package com.company;

public class Swallow extends Bird{
    int size;

    @Override
    void fly() {
        super.fly();
        System.out.println(" fly");
    }

    Swallow(String color, int size){
        super(color);
        this.size=size;
    }

    @Override
    public String toString() {
        return getColor()+" "+size;
    }
}
