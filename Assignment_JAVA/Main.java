package com.revature22;

public class Main
{
    public static void main(String[] args)
    {
        Operation op = new Operation();

        int num1 = 70;
        int num2 = 10;


        op.add(num1, num2);
        op.subtract(num1, num2);
        op.multiply(num1, num2);
        op.divide(num1, num2);
    }
}
