package ObjectOrientedTC_1;

public class CallVehicle {

    public static void main(String[] args)
    {

        Vehicle objectOfVehicle = new Vehicle();

        objectOfVehicle.provideWheelsDetails();
        //objectOfVehicle.summaryOfUserInput();

        System.out.println(objectOfVehicle.provideWheelsDetails());

    }
}
