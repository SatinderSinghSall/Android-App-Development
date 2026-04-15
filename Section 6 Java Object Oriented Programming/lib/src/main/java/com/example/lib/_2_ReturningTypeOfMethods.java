//Topic : The 'Returning Type of Methods' in Java Programming.

package com.example.lib;

public class _2_ReturningTypeOfMethods
{
    static void SayHello()
    {
        System.out.println("Hello, world. I am Satinder Singh Sall.");
    }

    static int AddNumbers()
    {
        int Number_1 = 10;
        int Number_2 = 20;

        int SumOfNumbers = Number_1 + Number_2;

        return SumOfNumbers;
    }

    static int SubtractNumbers()
    {
        int Number_3 = 10;
        int Number_4 = 20;

        return Number_3 - Number_4;
    }

    public static void main(String[] args)
    {
        System.out.println("\n\tTopic : The 'Returning Type of Methods' in Java Programming.");

        SayHello();

        int addNumbers = AddNumbers();
        System.out.println("The addition of 10 + 20 = " + addNumbers);

        int subtractNumbers = SubtractNumbers();
        System.out.println("The subtraction of 10 - 20 = " + subtractNumbers);
    }
}
