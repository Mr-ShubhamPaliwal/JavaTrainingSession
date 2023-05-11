package inheritancePackage.abstractAssignment2;

public class Bird extends Pet{

    public Bird(String n1) {
        super(n1);
    }

    @Override
    public void action() {
        System.out.println(petName+" is flying");
    }
}
