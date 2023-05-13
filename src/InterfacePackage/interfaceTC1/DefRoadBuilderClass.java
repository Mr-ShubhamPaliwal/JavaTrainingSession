package InterfacePackage.interfaceTC1;

public class DefRoadBuilderClass implements RoadConstruction_Interface{

    // Instance variables of DEF class
    private String roadSpecs;
    private String roadLocation;
    private String vendor;
    private String companyName;

    //Constructor for initialising value to companyName
    public DefRoadBuilderClass(String name2){
        this.companyName=name2;
    }

    @Override
    public String experience() {
        return "Constructing 20 roads";
    }

    @Override
    public float budget() {
        return 150000.00f;
    }

    @Override
    public void takeRoadSpecs(String spec) {
        this.roadSpecs = spec;
    }

    @Override
    public void setLocation(String location) {
        this.roadLocation = location;
    }

    @Override
    public String progress() {
        return "Project not Allotted";
    }

    @Override
    public String toString() {
        return "DefRoadBuilderClass{" +
                "roadSpecs='" + roadSpecs + '\'' +
                ", roadLocation='" + roadLocation + '\'' +
                ", vendor='" + vendor + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
