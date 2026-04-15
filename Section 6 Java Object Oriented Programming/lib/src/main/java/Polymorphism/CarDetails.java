package Polymorphism;

//Child Class.
public class CarDetails extends Vehicle
{
    String CarModel;

    public CarDetails(String ModelOfCar)
    {
        super(4);
        this.CarModel = ModelOfCar;
    }

    void Honk()
    {
        System.out.println("beep!! Beep!!! BEEP!!!!");
    }

    @Override
    void VehicleStart()
    {
        System.out.println("The Car is starting...");
        System.out.println("\t> The Car has successfully started.");
    }

    @Override
    void VehicleStop()
    {
        System.out.println("The cas has stopped.");
    }
}
