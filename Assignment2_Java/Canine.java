package com.Assignment2_Java;

abstract class Canine implements Animal
{
    public void roam()
    {
        System.out.println(this.getClass().getSimpleName() + " roams in a pack.");
    }
}
