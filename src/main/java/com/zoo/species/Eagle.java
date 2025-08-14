package com.zoo.species;

import com.zoo.animals.Bird;
import com.zoo.animals.IPlayable;
import com.zoo.animals.ISleepable;

public class Eagle extends Bird implements ISleepable, IPlayable{
    public Eagle(String name, int age, double weight, int energyLevel, double wingSpan) {
        super(name, wingSpan);
    }


    //методи
    @Override
    public void  uniqueBirdAction() {
        buildNest();
    }

    private void buildNest() {
            System.out.println ( name + " is building a nest on the tree ");
    int energy = getEnergyLevel();
            if (energy>=20) {
        setEnergyLevel(energy -20);
    } else {
        System.out.println( name + " little bit tired. Eagle needs to sleep! ");
    }
}

    @Override
    public void eat() {
        System.out.println( name + " is eating meet ");
    }

    @Override
    public void sleep() {
        System.out.println( name + " is sleeping Fiu-fiu");
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

    @Override
    public void play() {
        System.out.println( name + " is playing now ");
    }
}
