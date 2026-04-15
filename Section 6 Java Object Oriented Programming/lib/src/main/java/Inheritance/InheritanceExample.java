package Inheritance;

//Topic : The concept of 'Inheritance' in Java Programming.

public class InheritanceExample
{
    public static void main(String[] args)
    {
        System.out.println("\n\tTopic : The concept of 'Inheritance' in Java Programming.");

        CarDetails MyCar = new CarDetails("A320");

        System.out.println("\nThe car model is : " + MyCar.CarModel);
        
        MyCar.VehicleStart();
        MyCar.Honk();
        MyCar.TurnLeft();
        MyCar.TurnRight();
        MyCar.Honk();
        MyCar.TurnLeft();
        MyCar.VehicleStop();
    }
}
