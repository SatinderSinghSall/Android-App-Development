//Topic : The concept of Arrays in Java Programming.

package com.example.lib;

public class Arrays
{
    public static void main(String[] args)
    {
        System.out.println("\n\tTopic : The concept of Arrays in Java Programming.");

        int[] NumbersArray = new int[5];

        NumbersArray[0] = 10;
        NumbersArray[1] = 20;
        NumbersArray[2] = 30;
        NumbersArray[3] = 40;
        NumbersArray[4] = 50;

        System.out.println("\nThe value in index 0 is : " + NumbersArray[0]);
        System.out.println("The value in index 1 is : " + NumbersArray[1]);
        System.out.println("The value in index 2 is : " + NumbersArray[2]);
        System.out.println("The value in index 3 is : " + NumbersArray[3]);
        System.out.println("The value in index 4 is : " + NumbersArray[4]);

        System.out.println(); //For new-line only.

        for(int number : NumbersArray)
        {
            System.out.println("The data in 'NumbersArray' are : " + number);
        }

        System.out.println(); //For new-line only.

        int[][] MyMatrix_2DArray = new int[3][3];

        MyMatrix_2DArray[0][0] = 1;
        MyMatrix_2DArray[0][1] = 2;
        MyMatrix_2DArray[0][2] = 3;
        MyMatrix_2DArray[1][0] = 4;
        MyMatrix_2DArray[1][1] = 5;
        MyMatrix_2DArray[1][2] = 6;
        MyMatrix_2DArray[2][0] = 7;
        MyMatrix_2DArray[2][1] = 8;
        MyMatrix_2DArray[2][2] = 9;

        System.out.println("The value in index[0][0] is : " + MyMatrix_2DArray[0][0]);
        System.out.println("The value in index[0][1] is : " + MyMatrix_2DArray[0][1]);
        System.out.println("The value in index[0][2] is : " + MyMatrix_2DArray[0][2]);
        System.out.println("The value in index[1][0] is : " + MyMatrix_2DArray[1][0]);
        System.out.println("The value in index[1][1] is : " + MyMatrix_2DArray[1][1]);
        System.out.println("The value in index[1][2] is : " + MyMatrix_2DArray[1][2]);
        System.out.println("The value in index[2][0] is : " + MyMatrix_2DArray[2][0]);
        System.out.println("The value in index[2][1] is : " + MyMatrix_2DArray[2][1]);
        System.out.println("The value in index[2][2] is : " + MyMatrix_2DArray[2][2]);

        int[][] MyMatrix_2DArray_Way2 = {
                {11, 12, 13},
                {14, 15, 16},
                {17, 18, 19}
        };

        System.out.println("\nThe value in index[0][0] is : " + MyMatrix_2DArray_Way2[0][0]);
        System.out.println("The value in index[0][1] is : " + MyMatrix_2DArray_Way2[0][1]);
        System.out.println("The value in index[0][2] is : " + MyMatrix_2DArray_Way2[0][2]);
        System.out.println("The value in index[1][0] is : " + MyMatrix_2DArray_Way2[1][0]);
        System.out.println("The value in index[1][1] is : " + MyMatrix_2DArray_Way2[1][1]);
        System.out.println("The value in index[1][2] is : " + MyMatrix_2DArray_Way2[1][2]);
        System.out.println("The value in index[2][0] is : " + MyMatrix_2DArray_Way2[2][0]);
        System.out.println("The value in index[2][1] is : " + MyMatrix_2DArray_Way2[2][1]);
        System.out.println("The value in index[2][2] is : " + MyMatrix_2DArray_Way2[2][2]);
    }
}
