package com.zoo.species;

import com.zoo.animals.Bird;

public class Penguin extends Bird {
        public Penguin(String name, int age, double weight, int energyLevel, double wingSpan) {
            super(name, age, weight, energyLevel, wingSpan);
        }

    @Override
    public void makeSound() {
            countSound();
        System.out.println(name + "  makes  'Krya-Krya!'  ");
    }


    //у пінгвіна теж нікуди не уходить енергія, виходить, що і спати йому не треба.
    // але ж вони таки сплять)))

    public void swim(){
        int energy = getEnergyLevel();
        if (energy >=30) {
            System.out.println(name + " is swimming. Lost of energy is -30 ");
            setEnergyLevel( energy -30);
        } else {
            System.out.println( name + " must to rest. Critical level of energy ");
        }
    }

    @Override
    public void fly() {
            System.out.println(name + " can`t fly, but it can swim! ");
            swim();
        }
}
