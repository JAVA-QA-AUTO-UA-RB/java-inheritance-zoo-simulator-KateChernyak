package com.zoo.animals;

public abstract class Bird extends Animal {
    protected double wingSpan;

    public Bird(String name, double wingSpan) {
        super(name);
        this.wingSpan = wingSpan;
    }


    //методи
    public abstract void  uniqueBirdAction();

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
