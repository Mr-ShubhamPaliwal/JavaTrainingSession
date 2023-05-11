package inheritanceTC_1.abstractTC_1;

public class TriangleChild extends ShapeParent{


    public TriangleChild(String n1)
    {
        super(n1);
    }

    @Override
    public void draw()
    {
        System.out.println("Drawing Triangle");
    }
}
