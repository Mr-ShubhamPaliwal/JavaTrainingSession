package objectOrientedPackage;

import java.util.Scanner;

public class Vehicle {

    private int wheels =0;
    private int  passengers =0;

    private String vehicleType="";
    private String vehicleName="";

    Scanner scanner =new Scanner(System.in);

    public  int  provideWheelsDetails()
    {
        System.out.println("Provide vehicle name: ");
        vehicleName = scanner.next();
        System.out.println("Provide type of vehicle: ");
        vehicleType = scanner.next();

        System.out.println("Provide no. of wheels for vehicle: ");
        wheels = scanner.nextInt();
        System.out.println("Provide passenger capacity for vehicle: ");
        passengers = scanner.nextInt();

        return wheels;



    }

    public void  summaryOfUserInput()
    {
        System.out.println("I want to purchase "+vehicleType+" "+vehicleName+" Having "+wheels+" wheels and passenger capacity should be "+passengers);
    }



}
