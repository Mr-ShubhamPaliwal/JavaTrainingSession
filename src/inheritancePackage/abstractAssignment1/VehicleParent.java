package inheritancePackage.abstractAssignment1;

public class VehicleParent
{
    String vehicleName="";
    int vehicleRegisterNo=0;

    // Created a constructor having 2 parameter using  this keyword
    // this keyword is calling values from present class
    public VehicleParent( String vName,int vNumber)
    {
        this.vehicleName=vName;
        this.vehicleRegisterNo=vNumber;
    }

    // Parent Method
    public void printVehicleDetails()
    {
        System.out.println("I have a  "+vehicleName+"  whose registration no. is  "+vehicleRegisterNo);
    }


}
