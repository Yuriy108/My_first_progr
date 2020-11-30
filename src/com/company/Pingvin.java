package com.company;

public class Pingvin extends Bird {
    @Override
   public void fly() {
        super.fly();
        System.out.println(" swim");
    }
}
