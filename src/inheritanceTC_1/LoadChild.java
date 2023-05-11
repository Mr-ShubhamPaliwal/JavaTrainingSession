package inheritanceTC_1;

public class LoadChild extends VehicleParent
{
    String loadCapacity;

    // Created a constructor having 3 parameter using super and this keyword
    // super keyword is calling values in variables from parent class
    // this keyword is calling values from present class
    public LoadChild(String s1, int i1, String lCap){

        super(s1,i1);
        this.loadCapacity=lCap;
    }

    // Child Method giving his & parent and functions
    @Override
    public void printVehicleDetails(){

        super.printVehicleDetails();
        System.out.println("Load capacity of that "+vehicleName+ " is "+loadCapacity);
    }


}
