package com.day_04;

import com.day_03.student;

public class Sum_num
{
    public static int sumnum(int num)
    {
        if(num <= 1)
        {
            System.out.print(num + " + ");
            return 1;
        }

        System.out.print(num + " + ");
        return num + sumnum(num - 1);
    }

    public static void main(String args[])
    {
        int num = 5;
        int result = sumnum(num);
        System.out.println("\nThe sum of " + num + " is " + result);
    }
}
