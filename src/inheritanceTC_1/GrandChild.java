package inheritanceTC_1;

public class GrandChild extends PassengerChild
{
    String passengerName;
    public GrandChild(String vName, int vNubmer, int pNo,String pName){

        super(vName,vNubmer,pNo);
        this.passengerName=pName;
    }

    public void printVehicleDetails()
    {
        super.printVehicleDetails();
        System.out.println("Passenger traveling in "+vehicleName+ " with name of "+ passengerName);
    }


}
