//Topic : The concept of 'Classes' in Java Programming.

/*
    Definition:
    > Classes - Classes is a template or blueprint/Prototype of a Object, and
    > Objects - An Objects are the instance of the classes.

    Syntax:
    > class ClassName
      {
         //Fields, States, Attributes : Store Data.
         //Methods, Functionalities, Behaviour : Perform Operations.
      }

    > className ObjectName = new className();
*/

package com.example.lib;

class CarDetails_Class
{
    int YearOfProduction;
    int SpeedOfCar;

    void Accelerate()
    {
        SpeedOfCar = SpeedOfCar + 10;
        System.out.println("The current speed of the car is : " + SpeedOfCar);
    }

    void Brake()
    {
        SpeedOfCar = SpeedOfCar - 5;
        System.out.println("The current speed of the car is : " + SpeedOfCar);
    }
}

public class _5_ClassesAndObjects
{
    public static void main(String[] args)
    {
        System.out.println("\n\tTopic : The concept of 'Classes' in Java Programming.");

        CarDetails_Class Car_Object = new CarDetails_Class();

        Car_Object.SpeedOfCar = 200;
        Car_Object.YearOfProduction = 2023;

        System.out.println("The initial speed of the car was : " + Car_Object.SpeedOfCar);

        Car_Object.Accelerate();
        Car_Object.Accelerate();
        Car_Object.Brake();
        Car_Object.Accelerate();
        Car_Object.Accelerate();
        Car_Object.Accelerate();
        Car_Object.Brake();
        Car_Object.Accelerate();
        Car_Object.Accelerate();
        Car_Object.Accelerate();
        Car_Object.Accelerate();
        Car_Object.Accelerate();
        Car_Object.Accelerate();
        Car_Object.Accelerate();
        Car_Object.Accelerate();
    }
}
