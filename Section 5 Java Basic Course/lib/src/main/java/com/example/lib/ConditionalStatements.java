//Topic : The Conditional Statements in Java Programming.

package com.example.lib;

public class ConditionalStatements
{
    public static void main(String[] args)
    {
        System.out.println("\n\tTopic : The Conditional Statements in Java Programming.");

        int Age = 60;

        if(Age == 18)
        {
            System.out.println("\nYour age " + Age + ". You are an Adult.");
        }
        else if(Age == 60)
        {
            System.out.println("\nYou are aged.");
        }
        else
        {
            System.out.println("\nYou are minor.");
        }
    }
}
