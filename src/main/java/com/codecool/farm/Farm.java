package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {

    public List<Animal> animals;

    public Farm(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void feedAnimals() {
        if (!isEmpty()) {

            for (Animal animal : animals) {
                animal.feed();
            }

        }
    }

    public void butcher(Butcher butcher) {
        if (!isEmpty()) {

            for (int i = 0; i < animals.size(); i++) {
                if (butcher.canButcher(animals.get(i))) {
                    animals.remove(i);
                    i--;
                }
            }

        }
    }

    public boolean isEmpty() {

        return animals.isEmpty();

    }

    public List<String> getStatus() {

        List<String> statusList = new ArrayList<>();

        if (!isEmpty()) {
            for (Animal animal : animals) {
                statusList.add("There is a " + animal.getSize() + " sized " + animal.toString() + " in the farm.");
            }
        }

        return statusList;

    }
}
