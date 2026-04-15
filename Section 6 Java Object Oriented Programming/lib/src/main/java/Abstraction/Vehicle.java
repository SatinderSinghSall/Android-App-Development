package Abstraction;

//Parent Class.
public abstract class Vehicle
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

    abstract void Brake();
}
