package Method_Overriding;

//Topic : The concept of 'Method Overriding' in Java Programming.

public class Method_Overriding
{
    public static void main(String[] args)
    {
        System.out.println("\n\tTopic : The concept of 'Method Overriding' in Java Programming.");

        CarDetails MyCar = new CarDetails("A320");

        MyCar.VehicleStart();
        MyCar.Honk();
        MyCar.VehicleStop();
    }
}
