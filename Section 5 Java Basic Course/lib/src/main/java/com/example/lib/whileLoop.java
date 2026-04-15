//Topic : The 'while' loop in Java Programming.

package com.example.lib;

public class whileLoop
{
    public static void main(String[] args)
    {
        System.out.println("\n\tTopic : The 'while' loop in Java Programming.");

        int Number = 1;

        while(Number <= 5)
        {
            System.out.println("The number is : " + Number);
            Number = Number + 1; //Number++
        }
    }
}
