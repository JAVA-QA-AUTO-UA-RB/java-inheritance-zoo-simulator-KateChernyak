package com.zoo.species;

import com.zoo.animals.Mammal;

public class Lion extends Mammal {
    public Lion(String name, int age, double weight, int energyLevel, String furColor) {
        super(name, age, weight, energyLevel, furColor);
    }

    @Override
    public void makeSound() {
        countSound();
        System.out.println( name + "  growls 'Rrrrrr' ");
    }

    public void hunt() {
        int energy = getEnergyLevel();
        if (energy >=25) {
            System.out.println( name + " is hunting. Be careful! ");
            setEnergyLevel(energy -25);
        } else {
            System.out.println( name + " Its bad time for hunting. Lion needs a rest");
        }
    }
}