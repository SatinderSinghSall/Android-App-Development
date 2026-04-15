package Inheritance;

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
}
