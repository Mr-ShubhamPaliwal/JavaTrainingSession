package ObjectOrientedTC_1;

public class CallVehicle {

    public static void main(String[] args)
    {

        Vehicle objectOfVehicle = new Vehicle();

        int abc = objectOfVehicle.provideWheelsDetails();
        objectOfVehicle.summaryOfUserInput();

        System.out.println("No. of Wheel are :"+abc);

        Vehicle objectOfVehicle2 = new Vehicle();

        objectOfVehicle2.provideWheelsDetails();
        objectOfVehicle2.summaryOfUserInput();

        //System.out.println(objectOfVehicle2.provideWheelsDetails());



    }
}
