//Topic : The concept of 'Method Overloading' in Java Programming.

/*
    Definition:
    > The Method Overloading is a process in which multiple methods
      can have same name with different parameters.
*/

package com.example.lib;

public class _4_MethodOverloading
{
    static void SayHello()
    {
        System.out.println("Hello, world. I am Satinder Singh Sall.");
    }

    static int AddNumbers(int Number_1, int Number_2)
    {
        return Number_1 + Number_2;
    }

    static double AddNumbers(double Number_2, double Number_3)
    {
        return Number_2 + Number_3;
    }

    public static void main(String[] args)
    {
        System.out.println("\n\tTopic : The concept of 'Method Overloading' in Java Programming.");

        SayHello();

        int intAddNumbers = AddNumbers(10, 20);
        System.out.println("The 'integer' addition of : 10 + 20 = " + intAddNumbers);

        double doubleAddNumbers = AddNumbers(10.0, 20.0);
        System.out.println("The 'double' addition of : 10 + 20 = " + doubleAddNumbers);
    }
}
