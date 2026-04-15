package Abstraction;

public class TruckDetails extends Vehicle
{
    public TruckDetails(int NumberOfWheels)
    {
        super(NumberOfWheels);
    }

    @Override
    void VehicleStart()
    {
        System.out.println("The Truck is stating...");
        System.out.println("\t> The Truck has successfully started.");
    }

    @Override
    void Brake()
    {
        System.out.println("Hydraulic Brakes have been applied!! Stopping the Truck...");
        System.out.println("\t> The Truck is stopped now.");
    }
}
