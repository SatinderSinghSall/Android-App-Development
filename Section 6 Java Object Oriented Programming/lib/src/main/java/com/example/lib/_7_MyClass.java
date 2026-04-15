package com.example.lib;

class Car_Details
{
    int YearOfManufacture;
    int SpeedOfCar;

    void CarAccelerate()
    {
        SpeedOfCar = SpeedOfCar + 10;
        System.out.println("\tACCELERATOR APPLIED!! (Speed = Speed + 10)");
        System.out.println("The current speed of the car is : " + SpeedOfCar);
    }

    void CarBrakeApply()
    {
        SpeedOfCar = SpeedOfCar - 5;
        System.out.println("\tBRAKE APPLIED!! (Speed = Speed - 5)");
        System.out.println("The current speed of the car is : " + SpeedOfCar);
    }

    public Car_Details(int YearOfManufacture_2, int SpeedOfCar_2)
    {
        YearOfManufacture = YearOfManufacture_2;
        SpeedOfCar = SpeedOfCar_2;
    }
}

public class _7_MyClass
{
    public static void main(String[] args)
    {
        Car_Details ObjectOfCarDetails = new Car_Details(2023, 100);

        System.out.println("The initial speed of the car was : " + ObjectOfCarDetails.SpeedOfCar);

        ObjectOfCarDetails.CarAccelerate();
        ObjectOfCarDetails.CarAccelerate();
        ObjectOfCarDetails.CarBrakeApply();
    }
}
