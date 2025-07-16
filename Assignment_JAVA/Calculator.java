package com.revature22;

public class Calculator
{

    public void add(int a, int b)
    {
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
            System.out.println("Division by zero is not allowed.");
        }
    }

    public static void main(String[] args)
    {
        Calculator calc = new Calculator();

        int num1 = 20;
        int num2 = 5;

        calc.add(num1, num2);
        calc.subtract(num1, num2);
        calc.multiply(num1, num2);
        calc.divide(num1, num2);
    }
}
