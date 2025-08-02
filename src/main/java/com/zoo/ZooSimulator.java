package com.zoo;
import com.zoo.species.*;
import com.zoo.zookeper.ZooKeeper;

public class ZooSimulator {

    public static void main(String[] args) {
        Lion alex = new Lion("Alex", 3, 150, 100, "Golden");
        Elephant dumbo = new Elephant("Dumbo", 7, 5000.0, 100, "Gray");
        Eagle angryBird = new Eagle("Angry Bird", 10, 4.0, 100, 2.0);
        Penguin kovalsky = new Penguin("Kovalsky", 3, 20.0, 100, 1.0);

        ZooKeeper keeper = new ZooKeeper("Dubois");

        System.out.println( " Lets start a day in SuperZoo! ");
        System.out.println( " Zookeeper is checking all animals.  " );

        alex.displayInfo();
        dumbo.displayInfo();
        angryBird.displayInfo();
        kovalsky.displayInfo();

        System.out.println( " Animals are greeting Zookeeper " + keeper.getName());
        alex.makeSound();
        dumbo.makeSound();
        angryBird.makeSound();
        kovalsky.makeSound();

        keeper.playWithAnimal( dumbo);
        System.out.println( " Dumbo enjoy the game;)))  ");
        dumbo.spraySelf();

        System.out.println( " Happy Dumbo want to walk ");
        dumbo.walking();

        angryBird.fly();
        System.out.println( " Zookeeper saw an eagle in the sky " );
        keeper.playWithAnimal(angryBird);
        keeper.playWithAnimal(angryBird);
        angryBird.makeSound();
        angryBird.fly();

        System.out.println( " Zookeeper is going to Alex " );
        keeper.playWithAnimal(alex);

        System.out.println( " Lion played and wants to hunt");
        alex.makeSound();
        alex.hunt();
        alex.makeSound();
        alex.hunt();

        System.out.println( " At this time Penguin is waiting for his best friend" );
        kovalsky.makeSound();
        keeper.playWithAnimal(kovalsky);
        System.out.println( " Kovalsky wants to refresh and goes to the pool");
        kovalsky.swim();
        kovalsky.swim();

        keeper.checkAnimalEnergyLevel(angryBird);
        keeper.checkAnimalEnergyLevel(alex);
        keeper.checkAnimalEnergyLevel(dumbo);
        keeper.checkAnimalEnergyLevel(kovalsky);

        keeper.feedAnimal(angryBird);
        keeper.feedAnimal(alex);
        keeper.feedAnimal(dumbo);
        keeper.feedAnimal(kovalsky);

        System.out.println( " Animals thank Zookeeper " + keeper.getName());
        alex.makeSound();
        dumbo.makeSound();
        angryBird.makeSound();
        kovalsky.makeSound();

        System.out.println( " All animals are going to sleep");
        alex.sleep();
        dumbo.sleep();
        angryBird.sleep();
        kovalsky.sleep();


        System.out.println( " Final checkStatus ");
        keeper.checkAnimalEnergyLevel(alex);
        keeper.checkAnimalEnergyLevel(dumbo);
        keeper.checkAnimalEnergyLevel(angryBird);
        keeper.checkAnimalEnergyLevel(kovalsky);

        System.out.println("   Daily Statistics   ");

        System.out.println(alex.getName()  + ": ate " + alex.getEatCount() + ", slept " + alex.getSleepCount() + ", sounds " + alex.getSoundCount());
        System.out.println(dumbo.getName() + ": ate " + dumbo.getEatCount() + ", slept " + dumbo.getSleepCount() + ", sounds " + dumbo.getSoundCount());
        System.out.println(angryBird.getName() + ": ate " + angryBird.getEatCount() + ", slept " + angryBird.getSleepCount() + ", sounds " + angryBird.getSoundCount());
        System.out.println(kovalsky.getName() + ": ate " + kovalsky.getEatCount() + ", slept " + kovalsky.getSleepCount() + ", sounds " + kovalsky.getSoundCount());
    }




                // Створіть кілька об'єктів різних тварин (лев, орел, пінгвін, слон), задавши їх унікальні параметри.

        // Створіть об'єкт ZooKeeper і прив'яжіть його до зоопарку.

        // Додайте логіку, яка представляє типові події дня в зоопарку:
        // - Годування тварин: використання методу feedAnimal().
        // - Гра з тваринами: використання методу playWithAnimal().
        // - Перевірка рівня енергії тварин: використання методу checkAnimalEnergyLevel().

        // Симулюйте зміну стану тварин (наприклад, втома після грається, зростання енергії після їжі).

        // Виведіть фінальні результати та стани тварин наприкінці дня.

    }

