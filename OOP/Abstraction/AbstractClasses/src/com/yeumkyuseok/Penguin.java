package com.yeumkyuseok;

public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I'm not very goot at that, can I go for a swim instead?");
    }
}
