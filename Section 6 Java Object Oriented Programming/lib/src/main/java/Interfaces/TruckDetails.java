package Interfaces;

public class TruckDetails extends Vehicle implements VehicleInterface
{
    public TruckDetails(int NumberOfWheels)
    {
        super(NumberOfWheels);
    }

    @Override
    public void StartEngine()
    {
        System.out.println("\nStarting an Engine of the Truck...");
        System.out.println("\t> The Engine has been started.");
    }

    @Override
    public void StopEngine()
    {
        System.out.println("Stopping an Engine of the Truck...");
        System.out.println("> The Engine has been stopped.");
    }

    @Override
    public void Accelerate()
    {
        System.out.println("The accelerator has been applied! moving the Truck now...");
        System.out.println("\t> The Truck is now moving.");
    }

    @Override
    public void Brake()
    {
        System.out.println("The brake has been applied! stopping the car now...");
        System.out.println("\t> The Truck has been slowed down/stopped.");
    }
}
