package Polymorphism;

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
}
