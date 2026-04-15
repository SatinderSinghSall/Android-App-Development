//Topic : The Methods in Java Programming.

/*
    Definition:
    > A Method is a block of code that perform specific task.

    Types of Method:
    > Java Programming has two types of Methods-
      i) User-Defined Method(s), and
      ii) Standard Library Method(s).

      Syntax:
      > Creating a Method -
        static returnType methodName()
        {
            methodBody_1;
            methodBody_2;
            methodBody_n;
        }
      > Calling a Method -
        methodName();
*/

package com.example.lib;

public class _1_Methods
{
    static void Method_SayHello() //Creating & Defining a Method.
    {
        System.out.println("\nHello, World. I am Satinder Singh Sall.");
    }

    public static void main(String[] args)
    {
        System.out.println("\n\tTopic : The Methods in Java Programming.");
        Method_SayHello(); //Calling a Method.
    }
}