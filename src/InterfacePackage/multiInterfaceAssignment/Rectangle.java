package InterfacePackage.multiInterfaceAssignment;

public class Rectangle implements Shape, Drawable {
    String shapeName;
    private int length;
    private int breadth;

    public Rectangle(String shapeName,int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        this.shapeName=shapeName;
    }


    @Override
    public void calculatePerimeter() {

        int perimeterOfRectangle = 2 * length + 2 * breadth;
        System.out.println("Perimeter of Rectangle = " + perimeterOfRectangle);
    }

    @Override
    public void calculateArea() {

        int areaOfRectangle = length * breadth;
        System.out.println("Area of Rectangle = " + areaOfRectangle);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");

    }

    @Override
    public String getName() {

        return shapeName;

    }
}
