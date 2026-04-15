package Polymorphism;

//Topic : The concept of 'Method Overriding' in Java Programming.

public class Polymorphism_Example
{
    public static void main(String[] args)
    {
        System.out.println("\n\tTopic : The concept of 'Method Overriding' in Java Programming.\n");

        Vehicle Vehicle_1 = new CarDetails("BMW");
        Vehicle Vehicle_2 = new TruckDetails(15);

        Vehicle_1.VehicleStart();
        Vehicle_2.VehicleStart();
    }
}
