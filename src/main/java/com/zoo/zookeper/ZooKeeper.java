package com.zoo.zookeper;

import com.zoo.animals.Animal;


public class ZooKeeper {
    private String name;


    public ZooKeeper(String name) {
        this.name = name;
    }


    public void feedAnimal(Animal animal) {
        System.out.println(name + " feeds an animal with name: " + animal.getName());
        animal.eat();
    }

    public void playWithAnimal(Animal animal) {
        System.out.println(name + " is playing with " + animal.getName());
        animal.makeSound();
    }

    public void checkAnimalEnergyLevel(Animal animal) {
        int energy = animal.getEnergyLevel();
        String level = "";// чесно кажу  - тут спитала гепете, бо ніяк не виходило ініціалізувати Левел
        if (energy <= 30) level = "Low";
        else if (energy <= 70) level = "Medium";
        else if (energy > 71) level = "High";
        System.out.println(animal.getName() + "'s energy level is: " + level);
    }


    public String getName() {
        return name;
    }
}