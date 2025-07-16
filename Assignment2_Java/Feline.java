package com.Assignment2_Java;

abstract class Feline implements Animal
{
    public void roam() {
        System.out.println(this.getClass().getSimpleName() + " roams silently.");
    }
}
