package inheritancePackage.abstractTC_1;

public class SquareChild extends ShapeParent{


    public SquareChild(String n) {
        super(n);
    }

    @Override
    public void draw() {

        System.out.println("Drawing Square");

    }
}
