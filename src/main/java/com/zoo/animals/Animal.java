package com.zoo.animals;

public abstract class Animal implements IEatable, ISleepable {
    protected String name;
    private int energyLevel = 100;

    //для статистики оголошу 3 змінні
    protected int countEat;
    protected int countSleep;
    protected int countSound;


    // конструктор для створення тварини з рівнем енергії по дефолту
    public Animal(String name){
        this.name = name;
    }


    // методи
    public abstract void makeSound();

    @Override
    public abstract void eat();

    @Override
    public abstract void sleep();


    public void displayInfo() {
        System.out.println(" Name: " + name +  " , EnergyLevel: " + energyLevel);
    }


    // для виводу статистики в кінці гри

    public void countEat() {countEat++;
    }

    public void countSleep() {countSleep++;
    }

    public void countSound() {countSound++;
    }


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

    //геттери

    public String getName() {
        return name;}

    public int getEnergyLevel() {
        return energyLevel;}

    public int getEatCount() {
        return countEat; }

    public int getSleepCount() {
        return countSleep; }

     public int getSoundCount() {
        return countSound; }
}
