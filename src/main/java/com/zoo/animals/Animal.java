package com.zoo.animals;

public class Animal {
    protected String name;
    protected int age;
    protected double weight;
    private int energyLevel = 100;

    //для статистики оголошу 3 змінні
    protected int countEat;
    protected int countSleep;
    protected int countSound;

    public Animal(String name, int age, double weight, int energyLevel) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        setEnergyLevel(energyLevel);
    }

    public void eat() {
        energyLevel = energyLevel + 20;
        if (energyLevel > 100) {
            energyLevel = 100;
        }
        countEat();
        System.out.println(" Animal " + name + " is fed and gained Energy " + energyLevel);

    }
    // тут я зробила перевірку, щоб енергія не перевищувала 100 після прийому їжі
    // те саме зі сном, щоб тваринка не померла від щастя))

    public void sleep() {
        energyLevel = energyLevel + 30;
        if (energyLevel > 100) {
            energyLevel = 100;
        }
        countSleep ();
        System.out.println(" Animal " + name + " slept and got Energy " + energyLevel);
    }

    public void makeSound() {
        countSound();
        System.out.println(name + " make a sound ");
    }

    public void displayInfo() {
        System.out.println(" Name: " + name + " , Age: " + age + " , Weight: " + weight + " , EnergyLevel: " + energyLevel);
    }


    // для виводу статистики в кінці гри

    public void countEat() {
        countEat++;
    }

    public void countSleep() {
        countSleep++;
    }

    public void countSound() {
        countSound++;
    }


    //геттери

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }
    public int getEatCount() {
        return countEat; }

    public int getSleepCount() {
        return countSleep; }

     public int getSoundCount() {
        return countSound; }


    // сеттер

    public void setEnergyLevel(int energyLevel) {
        if (energyLevel < 0) {
            this.energyLevel = 0;
        } else if (energyLevel > 100) {
            this.energyLevel = 100;
        } else {
            this.energyLevel = energyLevel;
        }
    }
}