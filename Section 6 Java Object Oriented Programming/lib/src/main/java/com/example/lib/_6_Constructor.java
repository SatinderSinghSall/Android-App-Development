//Topic : The concept of 'Constructor' in Java Programming.

package com.example.lib;

class CarDetails
{
    int YearOfManufactor;
    int SpeedOfCar;

    void CarAccelerate()
    {
        SpeedOfCar = SpeedOfCar + 10;
        System.out.println("The current speed of the car is : " + SpeedOfCar);
    }

    void CarBrakeApply()
    {
        SpeedOfCar = SpeedOfCar - 5;
        System.out.println("The current speed of the car is : " + SpeedOfCar);
    }

    public CarDetails(int YearOfManufactor_2, int SpeedOfCar_2)
    {
        YearOfManufactor = YearOfManufactor_2;
        SpeedOfCar = SpeedOfCar_2;
    }
}

public class _6_Constructor
{
    public static void main(String[] args)
    {
        System.out.println("\n\tTopic : The concept of 'Constructor' in Java Programming.");

        CarDetails ObjectOfCarDetails = new CarDetails(2023, 100);

        System.out.println("The initial speed of the car was : " + ObjectOfCarDetails.SpeedOfCar);

        ObjectOfCarDetails.CarAccelerate();
        ObjectOfCarDetails.CarAccelerate();
        ObjectOfCarDetails.CarBrakeApply();
    }
}
