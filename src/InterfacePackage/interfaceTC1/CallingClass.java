package InterfacePackage.interfaceTC1;

public class CallingClass {

    public static void main(String[] args) {

        //int sum = getSum(input1, input2);
        RoadConstruction_Interface selectedVendor = releaseTenderAndSelectContractor();

        String experienceVar = selectedVendor.experience(); // ye kyun kiya Nahi aya samjh ??
        System.out.println("Experience of "+ experienceVar);

        float budgetVar = selectedVendor.budget(); //  ??????
        System.out.println("Budget is "+ budgetVar);

        selectedVendor.setLocation("Pratap Nagar"); // ??????
        selectedVendor.takeRoadSpecs("Length= 100km, Width= 60 feet"); // ??????

        System.out.println(selectedVendor.toString());

    }

    private static RoadConstruction_Interface releaseTenderAndSelectContractor() {

        RoadConstruction_Interface vendor1 = new AbcLtdRoadBuilderClass("ABC Limited");
        RoadConstruction_Interface vendor2 = new DefRoadBuilderClass("DEF Limited");

        return vendor2;
    }
}
