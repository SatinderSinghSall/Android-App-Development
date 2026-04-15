package Method_Overriding;

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
}
