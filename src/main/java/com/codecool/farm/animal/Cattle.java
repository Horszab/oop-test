package com.codecool.farm.animal;

public class Cattle extends Animal {


    @Override
    public void feed() {
        setSize(2);
    }

    @Override
    public String toString() {
        return "cattle";
    }
}
