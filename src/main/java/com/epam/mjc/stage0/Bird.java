package com.epam.mjc.stage0;

public class Bird extends Animal {

    public Bird() {
        super("blue", 2, false);
        System.err.println("This animal is mostly blue. It has 2 paws and no fur." +
                " Moreover, it has 2 wings and can fly.");
    }

    @Override
    public String getDescription() {
        String s = "This animal is mostly blue. It has 2 paws and no fur." +
                " Moreover, it has 2 wings and can fly.";
        return s;
    }
}
