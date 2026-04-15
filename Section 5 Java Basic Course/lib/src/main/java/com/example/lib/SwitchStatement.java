//Topic : The Switch statement in Java Programming.

package com.example.lib;

public class SwitchStatement
{
    public static void main(String[] args)
    {
        int DayOfWeek = 8;

        switch (DayOfWeek)
        {
            case 1:
                System.out.println("\nSunday.");
                break;
            case 2:
                System.out.println("\nMonday");
                break;
            case 3:
                System.out.println("\nTuesday.");
                break;
            case 4:
                System.out.println("\nWednesday.");
                break;
            case 5:
                System.out.println("\nThursday.");
                break;
            case 6:
                System.out.println("\nFriday.");
                break;
            case 7:
                System.out.println("\nSaturday.");
                break;
            default:
                System.out.println("\nError: Unknown entry.");
        }
    }
}
