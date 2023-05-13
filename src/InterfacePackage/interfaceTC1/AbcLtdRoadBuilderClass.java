package InterfacePackage.interfaceTC1;

public class AbcLtdRoadBuilderClass implements RoadConstruction_Interface {

    // Instance variables of ABC class
    private String roadSpecs;
    private String roadLocation;
    private String vendor;
    private String companyName;


    //Constructor for initialising value to companyName
    public AbcLtdRoadBuilderClass(String name1){
        this.companyName=name1;
    }


    @Override
    public String experience() {
        return "Constructing 10 roads";
    }

    @Override
    public float budget() {
        return 200000.00f;
    }

    @Override
    public void takeRoadSpecs(String spec) {

       // this.takeRoadSpecs(spec); //Nahi aya samaj ????
        this.roadSpecs = spec;
    }

    @Override
    public void setLocation(String location) {
        // this.setLocation(location); //Nahi aya samaj ????
        this.roadLocation = location;
    }

    @Override
    public String progress() {
        return "Project not started";
    }

    @Override
    public String toString() {
        return "AbcLtdRoadBuilder{" +
                "roadSpecs='" + roadSpecs + '\'' +
                ", location='" + roadLocation + '\'' +
                ", vendor='" + vendor + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
