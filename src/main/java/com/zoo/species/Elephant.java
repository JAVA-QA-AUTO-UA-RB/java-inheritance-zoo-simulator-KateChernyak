package com.zoo.species;

import com.zoo.animals.IPlayable;
import com.zoo.animals.Mammal;

public class Elephant extends Mammal implements IPlayable {
    public Elephant(String name,  int energyLevel, String furColor) {
        super(name,  furColor);
    }


    //методи
    @Override
    public void move() {
        System.out.println( "  \"Elephant stomps heavily.\"");
    }

    @Override
    public void play() {
        System.out.println( name + " is playing with water");
    }

    @Override
    public void eat() {
        System.out.println( name + " is eating Nom-Nom-Nom ");
    }

    @Override
    public void sleep() {
        System.out.println( name + " is sleeping HShhhhhhh");
    }

    @Override
    public void makeSound() {
        countSound();
        System.out.println(name + "  trumpets 'Truba-ba-ba!' ");
    }

    public void spraySelf() {
        System.out.println(name + " pours itself ");
    }

    //виходить, що слон нікуди не витрачає енергію. так годувати його не треба.
    //тому додаю метод, що це виправить.

    public void walking() {
        int energy = getEnergyLevel();
        if (energy >= 20) {
            System.out.println(name + " is walking. Lost of energy is -20 ");
            setEnergyLevel(energy - 20);
        } else {
            System.out.println(name + " must to rest. Critical level of energy ");
        }
    }
}