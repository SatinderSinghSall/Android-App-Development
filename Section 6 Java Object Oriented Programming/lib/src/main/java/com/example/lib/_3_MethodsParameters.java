//Topic : The 'Methods Parameters' in Java programming.

package com.example.lib;

public class _3_MethodsParameters
{
    static void SayHello()
    {
        System.out.println("Hello, world. I am Satinder Singh Sall.");
    }

    static int AddNumbers(int Number_1, int Number_2) //(Parameter(s).)
    {
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
        System.out.println("\n\tTopic : The 'Methods Parameters' in Java programming.");

        SayHello();

        int addNumbers = AddNumbers(10, 20);
        System.out.println("The addition of 10 + 20 = " + addNumbers);

        int subtractNumbers = SubtractNumbers();
        System.out.println("The subtraction of 10 - 20 = " + subtractNumbers);
    }
}
