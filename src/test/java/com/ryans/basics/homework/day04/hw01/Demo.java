package com.ryans.basics.homework.day04.hw01;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void behave(Animal animal) {
        animal.eat();
        animal.sleep();
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        behave(animal); // polymorphism
        System.out.println("--------");
        Dog dog = new Dog();
        behave(dog);
        dog.watch();
        System.out.println("--------");
        Cat cat = new Cat();
        behave(cat);
        cat.catchMouse();

    }
}
