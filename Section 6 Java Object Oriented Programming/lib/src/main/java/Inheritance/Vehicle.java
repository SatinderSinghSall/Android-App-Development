package Inheritance;

//Parent Class.
public class Vehicle
{
    int NumberOfWheels;

    public Vehicle(int NumberOfWheels)
    {
        this.NumberOfWheels = NumberOfWheels;
    }

    void VehicleStart()
    {
        System.out.println("The Vehicle has started.");
    }

    void  VehicleStop()
    {
        System.out.println("The Vehicle has stopped.");
    }

    void TurnLeft()
    {
        System.out.println("The vehicle is turning left...");
        System.out.println("\tSuccessfully turned left.");
    }

    void TurnRight()
    {
        System.out.println("The vehicle is turning right...");
        System.out.println("\tSuccessfully turned right.");
    }
}
