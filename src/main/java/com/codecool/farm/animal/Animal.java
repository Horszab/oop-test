package com.codecool.farm.animal;

public abstract class Animal {

    private int size;

    public Animal() {
        this.size = 0;
    }

    public void setSize(int size) {
        this.size = size + this.size;
    }

    public int getSize() {
        return size;
    }

    public abstract void feed();

}
