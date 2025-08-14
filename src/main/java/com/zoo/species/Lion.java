package com.zoo.species;

import com.zoo.animals.IPlayable;
import com.zoo.animals.Mammal;

public class Lion extends Mammal implements IPlayable {
    public Lion(String name, int age, double weight, int energyLevel, String furColor) {
        super(name, furColor);
    }


    //методи
    @Override
    public void move() {
        System.out.println( "  \"Lion runs swiftly.\"");
    }

    @Override
    public void eat() {
        System.out.println( name + " is eating Am-am-am ");
    }

    @Override
    public void sleep() {
        System.out.println( name + " is sleeping Hrrrrrrr");
    }

    @Override
    public void play() {
        System.out.println( name + " is playing with mouse");
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