package com.zoo.species;

import com.zoo.animals.Bird;

public class Eagle extends Bird {
    public Eagle(String name, int age, double weight, int energyLevel, double wingSpan) {
        super(name, age, weight, energyLevel, wingSpan);
    }

    @Override
    public void makeSound() {
        countSound();
        System.out.println(name + "  makes  'Ckri-Ckri!'  ");
    }

    @Override
    public void fly() {
        int energy = getEnergyLevel();
        if (energy >= 20) {
            System.out.println(name + " is flying. Lost of energy is -20 ");
            setEnergyLevel(energy - 20);
        } else {
            System.out.println(name + " must to rest. Critical level of energy ");
        }
    }
}
