package Interfaces;

//Child Class.
public class CarDetails implements VehicleInterface
{
    String CarModel;

    public CarDetails(String ModelOfCar)
    {
        this.CarModel = ModelOfCar;
    }

    void Honk()
    {
        System.out.println("beep!! Beep!!! BEEP!!!!");
    }


    @Override
    public void StartEngine()
    {
        System.out.println("Starting an Engine of the Car...");
        System.out.println("\t> Engine has been started.");
    }

    @Override
    public void StopEngine()
    {
        System.out.println("Stopping an Engine of the Car...");
        System.out.println("> Engine has been stopped.");
    }

    @Override
    public void Accelerate()
    {
        System.out.println("The accelerator has been applied! moving the car now...");
        System.out.println("\t> Car is now moving.");
    }

    @Override
    public void Brake()
    {
        System.out.println("The brake has been applied! stopping the car now...");
        System.out.println("\t> The car has been slowed down/stopped.");
    }
}
