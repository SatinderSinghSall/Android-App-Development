package Abstraction;

//Topic : The concept of 'Abstraction' in Java Programming.

public class Abstraction_Example
{
    public static void main(String[] args)
    {
        System.out.println("\n\tTopic : The concept of 'Abstraction' in Java Programming.\n");

        Vehicle Vehicle_1 = new CarDetails("BMW");
        Vehicle Vehicle_2 = new TruckDetails(15);

        Vehicle_1.VehicleStart();
        Vehicle_2.VehicleStart();

        Vehicle_1.Brake();
        Vehicle_2.Brake();
    }
}
