package com.revature22;

public class Operation
{
    public void add(int a, int b) {
        int result = a + b;
        System.out.println("Addition: " + result);
    }

    public void subtract(int a, int b)
    {
        int result = a - b;
        System.out.println("Subtraction: " + result);
    }

    public void multiply(int a, int b)
    {
        int result = a * b;
        System.out.println("Multiplication: " + result);
    }

    public void divide(int a, int b)
    {
        if (b != 0)
        {
            double result = (double) a / b;
            System.out.println("Division: " + result);
        }
        else
        {
            System.out.println("Cannot divide by zero.");
        }
    }
}
