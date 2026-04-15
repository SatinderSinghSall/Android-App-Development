//Topic : The 'break' and 'continue' keyword in Java Programming.

package com.example.lib;

public class BreakContinue
{
    public static void main(String[] args)
    {
        System.out.println("\n\tTopic : The 'break' and 'continue' keyword in Java Programming.");

        for(int i = 0; i < 10; i++)
        {
            if(i == 4)
            {
                System.out.println("You have been break from the loop as the value of 'i' has been reached to 4.");
                break;
            }
            System.out.println("The value of 'i' is : " + i);
        }

        System.out.println(); //For new-line only.

        for(int j = 0; j < 10; j++)
        {
            if(j == 4)
            {
                System.out.println("You have been break from the loop as the value of 'j' has been reached to 4.");
                continue;
            }
            System.out.println("The value of 'i' is : " + j);
        }
    }
}
