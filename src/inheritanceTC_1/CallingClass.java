package inheritanceTC_1;

public class CallingClass
{

    public static void main(String[] args)
    {
        // Created object of parent class and printed parent functions
        VehicleParent v1 = new VehicleParent("Car",11111);
        v1.printVehicleDetails();

        // Created object of First Child class and printed parent & child functions by calling same parent class method
        PassengerChild v2 = new PassengerChild("Bus",22222,50);
        v2.printVehicleDetails();

        // Created object of Second Child class and printed parent & child functions by calling same parent class method
        LoadChild v3 = new LoadChild("Truck",33333,"1000KG");
        v3.printVehicleDetails();

        //// Created object of Grand Child class and printed parent,child & grand child functions by calling same parent class method
        GrandChild v4 = new GrandChild("Train",44444,500,"Shubham Paliwal");
        v4.printVehicleDetails();

        System.out.println();

    }
}
