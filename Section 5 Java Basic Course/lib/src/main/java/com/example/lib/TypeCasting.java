//Topic : The Type Casting in Java Programming.

/*
    Definition:
    > A Type Casting is the process of converting
      a value from one Data Type to another Data Type.
    > Java Programming Supports Two (2) types of Type Casting:-
      i) Implicit Type Casting : Happens automatically & no loss of data, and
      ii) Explicit Type Casting : Need to perform manually.
*/

package com.example.lib;

public class TypeCasting
{
    public static void main(String[] args)
    {
        System.out.println("\n\tTopic : The Type Casting in Java Programming.");

        System.out.println("1. Implicit Type Casting");
        int intNumber = 10;
        double doubleNumber = intNumber; //Output : 10.0 | --> No Data Loss.
        System.out.println("The 'doubleNumber' value is : " + doubleNumber);

        System.out.println("\n2. Explicit Type Casting");
        double double_PI = 3.14;
        int intNumber_PI = (int)double_PI; //Manually converted it to int.
        System.out.println("The 'intNumber_PI' value is : " + intNumber_PI); //Output : 3 | --> There is a Data Loss.

        //Type Casting Between Different Data Type.
        System.out.println("\n\tType Casting Between Different Data Type:-");
        int MyInt = 5;
        char MyChar = (char) (MyInt + 'A');
        System.out.println("The variable 'MyChar' contains : " + MyChar);
    }
}
