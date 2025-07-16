package com.Assignment2_Java;

public class Main
{
    public static void main(String[] args)
    {
        Animal[] animals = { new Lion(), new Tiger(), new Cat(), new Dog(), new Wolf(), new Hippo() };

        for (Animal animal : animals) {
            System.out.println("== " + animal.getClass().getSimpleName() + " ==");
            animal.makeNoise();
            animal.eat();
            animal.sleep();
            animal.roam();
            System.out.println();
        }
    }
}
