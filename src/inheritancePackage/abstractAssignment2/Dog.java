package inheritancePackage.abstractAssignment2;

public class Dog extends Pet{

    public Dog(String n2) {
        super(n2);
    }

    @Override
    public void action() {
        System.out.println(petName+" is barking");
    }
}
