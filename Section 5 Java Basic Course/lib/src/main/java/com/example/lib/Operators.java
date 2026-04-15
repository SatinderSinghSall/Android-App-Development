//Topic : The Operators in Java Programming.

package com.example.lib;

public class Operators
{
    public static void main(String[] args)
    {
        System.out.println("\n\tTopic : The Operators in Java Programming.");

        //Operators : 1 - Arithmetic Operators. (+, -, *, /, and %)
        System.out.println("\nOperators : 1 - Arithmetic Operators. (+, -, *, /, and %)");
        System.out.println(1 + 2);
        System.out.println(1 - 2);
        System.out.println(2 * 2);
        System.out.println(10 / 5);
        System.out.println(10 % 5);

        //Operators : 2 - Comparison Operator. (==, !=, <, >, <=, and >=)
        System.out.println("\nOperators : 2 - Comparison Operator. (==, !=, <, >, <=, and >=)");
        int X = 9;
        System.out.println(X == 10);
        System.out.println(X != 9999);
        System.out.println(X < 100);
        System.out.println(X > 100);
        System.out.println(X <= 10);
        System.out.println(X >= 10);

        //Operators : 3 - Logical Operators. (&&, ||, and !)
        boolean IsSummy = true;
        boolean NeedUmberella = false;

        boolean ShouldGoOutside = IsSummy && !NeedUmberella;
        boolean CanPlayGame = IsSummy || NeedUmberella;

        System.out.println("\nShould go outside : " + ShouldGoOutside);
        System.out.println("Can we play Game : " + CanPlayGame);
    }
}
