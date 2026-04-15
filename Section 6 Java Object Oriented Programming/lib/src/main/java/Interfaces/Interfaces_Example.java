package Interfaces;

//Topic : The concept of 'Interfaces' in Java Programming.

public class Interfaces_Example
{
    public static void main(String[] args)
    {
        System.out.println("\n\tTopic : The concept of 'Interfaces' in Java Programming.\n");

        CarDetails Vehicle_1 = new CarDetails("BMW");
        TruckDetails Vehicle_2 = new TruckDetails(15);

        Vehicle_1.StartEngine();
        Vehicle_2.VehicleStart();
        Vehicle_2.Accelerate();
    }
}
