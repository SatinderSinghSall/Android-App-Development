//Topic : The Data Types in Python programming.

package com.example.lib;

public class DataTypes
{
    public static void main(String[] args)
    {
        System.out.print("\n\tTopic : The Data Types in Python programming.\n");

        //1. The 'int' Data Types - Number(s) Data Type.
        System.out.println("1. The 'int' Data Types - Numbers Data Type:-");
        byte ByteVariable = 100; //byte: Can hold numbers between -128 --> +127.
        System.out.println("The byte variable 'ByteVariable' contains : " + ByteVariable);

        //2. The 'short' Data Type - Number(s) Data Type.
        System.out.println("\n2. The 'short' Data Type - Number(s) Data Type.");
        short ShortVariable = 7777; //short: Can hold numbers  between -32, -768 --> +32, +767.
        System.out.println("The byte variable 'ByteVariable' contains : " + ShortVariable);

        //3. The 'int' Data Type - Number(s) Data Type.
        System.out.println("\n3. The 'int' Data Type - Number(s) Data Type.");
        int IntVariable = 88776655; //int: Can hold numbers between -2147483648 --> +2147483647.
        System.out.println("The int variable 'intVariable' contains : " + IntVariable);

        //4. The 'long' Data Type - Number(s) Data Type.
        System.out.println("\n4. The 'int' Data Type - Number(s) Data Type.");
        long LongVariable = 1122334455667788L; //long: Can hold numbers between -9223372036854775808 --> +9223372036854775807 64 bit integer. Must use 'L/l' in order to know the IDE that the number belongs to 'long' Data Type.
        System.out.println("The long variable 'LongVariable' contains : " + LongVariable);

        //5. The 'float' Data Type - Decimal Number(s) Data Type.
        System.out.print("\n5. The 'FloatVariable' Data Type - Decimal Number(s) Data Type.");
        float FloatVariable_PI = 3.14F; //float: Can store 32 bit of decimal numbers. Must use 'F/F' in order to know the IDE that the number belongs to 'float' Data Type.
        System.out.println("The long variable 'FloatVariable_PI' contains : " + FloatVariable_PI);

        //6. The 'double' Data Type - Decimal Number(s) Data Type.
        System.out.println("\n6. The 'double' Data Type - Decimal Number(s) Data Type.");
        double DoubleVariable_PI = 3.14159; //long: Can store 64 bit of decimal numbers.
        System.out.println("The long variable 'DoubleVariable_PI' contains : " + DoubleVariable_PI);

        //7. The 'boolean' Data Type - Boolean number(s) : true or false Data Type.
        System.out.println("\n7. The 'boolean' Data Type - Boolean number(s) : 0, 1 or True Data Type.");
        boolean BooleanVariable_IsRaining = true;
        System.out.println("The boolean variable 'BooleanVariable_IsRaining' contains : " + BooleanVariable_IsRaining);

        boolean AllCoinsCollected = false;
        AllCoinsCollected = true;
        System.out.println("Example --> Does the user has collected all the coins? | True or False? : " + AllCoinsCollected);

        //8. The 'char' Data Type - Character(s) Data Type.
        System.out.println("\n8. The 'char' Data Type - Character(s) Data Type.");
        char CharVariable = 'A'; //char: Holds only one single number, symbol or letter.
        char CharVariable_MyNumber = '7';
        char CharVariable_MySymbol = '$';
        System.out.println("The char variable 'CharVariable' contains : " + CharVariable);
        System.out.println("The char variable 'CharVariable_MyNumber' contains : " + CharVariable_MyNumber);
        System.out.println("The char variable 'CharVariable_MySymbol' contains : " + CharVariable_MySymbol);

        //9. The 'Strings' Data Type in Java Programming. (Collection of Character(s))
        System.out.println("\n9. The 'Strings' Data Type in Java Programming. (Collection of Character(s))");
        String StringVariable_MyName = "Satinder Singh Sall";
        System.out.println("My name is : " + StringVariable_MyName);

        //Concatenating Strings.
        String FirstName = "Satinder";
        String MiddleName = "Singh";
        String LastName = "Sall";
        String FullName = FirstName + " " + MiddleName + " " + LastName;

        System.out.println("My first name is : " + FirstName);
        System.out.println("My middle name is : " + MiddleName);
        System.out.println("My last name is : " + LastName);
        System.out.println("My full name : " + FullName);

        //Length of the Sting.
        int StringLength = FullName.length();
        System.out.println("The length of the String is : " + StringLength);
    }
}
