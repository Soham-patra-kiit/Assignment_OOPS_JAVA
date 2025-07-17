package com.day_04;

import java.util.Scanner;

class InsufficientException extends Exception
{
    InsufficientException(String message)
    {
        super(message);
    }
}

public class BankSystem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        try
        {
            if (amount > balance)
            {
                throw new InsufficientException("Insufficient Balance!");
            }
            else
            {
                balance = balance - amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            }
        }
        catch (InsufficientException e)
        {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
