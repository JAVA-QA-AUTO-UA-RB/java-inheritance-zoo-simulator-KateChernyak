package com.zoo.animals;

public class Bird extends Animal {
    protected double wingSpan;

    public Bird(String name, int age, double weight, int energyLevel, double wingSpan) {
        super(name, age, weight, energyLevel);
        this.wingSpan = wingSpan;
    }

    @Override
    public void makeSound() {
        countSound();
        System.out.println( name + "  makes  'KARRRAAAMBA!'  ");;
    }
    public void fly(){
        int energy = getEnergyLevel();
        if (energy >=15) {
            System.out.println(name + " is flying. Lost of energy is -15 ");
            setEnergyLevel( energy -15);
        } else {
            System.out.println( name + " must to rest. Critical level of energy ");
        }
    }
}
