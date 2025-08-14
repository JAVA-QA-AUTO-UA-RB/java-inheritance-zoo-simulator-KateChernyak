package com.zoo;
import com.zoo.animals.Animal;
import com.zoo.animals.IPlayable;
import com.zoo.species.*;
import com.zoo.zookeper.ZooKeeper;

public class ZooSimulator {

    public static void main(String[] args) {
        Lion alex = new Lion("Alex", 3,150,100,"Golden");
        Elephant dumbo = new Elephant("Dumbo", 100, "Gray");
        Eagle angryBird = new Eagle("Angry Bird", 10, 4.0, 100, 2.0);
        Penguin kovalsky = new Penguin("Kovalsky", 3, 20.0, 100, 1.0);

        ZooKeeper keeper = new ZooKeeper("Dubois");


        //масив Animal
        Animal[] animals = {alex, dumbo, angryBird, kovalsky};
        System.out.println(" Good morning, Animals! ");
        for (Animal a : animals) {
            a.displayInfo();
            a.makeSound();
        }

        // масив IPlayable
        IPlayable[] playables = {alex, dumbo, kovalsky, angryBird};

        System.out.println(" Its time for fun!!! ");
        for (IPlayable p : playables) {
            keeper.playWithAnimal(p);
        }

        // час годівлі
        System.out.println(" Now its time to feed all animals ");
        for (Animal a : animals) {
            keeper.feedAnimal(a);
        }


        // перевірка рівня енергії
        System.out.println(" Lets check energy level of animal ");
        for (Animal a : animals) {
            keeper.checkAnimalEnergyLevel(a);
        }


        // "любіма" мною статистика
        System.out.println(" Daily Statistics ");
        for (Animal a : animals) {
            System.out.println(a.getName() + " ate " + a.getEatCount() +
                    " , slept " + a.getSleepCount() +
                    " , sounds " + a.getSoundCount());
        }
    }
}

