package com.zoo.animals;

public class Mammal extends Animal {
    protected String furColor;

    public Mammal(String name, int age, double weight, int energyLevel, String furColor) {
        super(name, age, weight, energyLevel);
        this.furColor = furColor;
    }

    @Override
    public void makeSound() {
        System.out.println(name + "  makes  'HHHHHRRRRR!'  ");

    }

    public void groom(){
        System.out.println( name + " needs grooming");
    }
}
