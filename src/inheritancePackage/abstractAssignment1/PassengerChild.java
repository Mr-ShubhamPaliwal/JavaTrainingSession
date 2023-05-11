package inheritancePackage.abstractAssignment1;

public class PassengerChild extends VehicleParent {

    int passengerNo;
    // Created a constructor having 3 parameter using super and this keyword
    // super keyword is calling values in variables from parent class
    // this keyword is calling values from present class
    public PassengerChild(String vName, int vNubmer, int pNo)
    {
        super(vName,vNubmer);
        this.passengerNo=pNo;
    }

    // Child Method giving his & parent and functions
    @Override
    public void printVehicleDetails()
    {
        super.printVehicleDetails();
        System.out.println("Passenger capacity of that "+vehicleName+ " is "+ passengerNo);
    }



}



