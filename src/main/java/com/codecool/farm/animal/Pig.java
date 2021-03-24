package com.codecool.farm.animal;

public class Pig extends Animal {

    @Override
    public void feed() {
        setSize(1);
    }

    @Override
    public String toString() {
        return "pig";
    }
}
