package InterfacePackage.multiInterfaceAssignment;

public class Circle implements Shape, Drawable {

    String shapeName;

    private int radius;
    private float pie = 3.14f;

    public Circle(String shapeName,int radius) {

        this.radius = radius;
        this.shapeName=shapeName;
    }

    @Override
    public void calculatePerimeter() {

        float perimeterOfCircle = 2 * pie * radius;
        System.out.println("Perimeter of Circle = " + perimeterOfCircle);
    }

    @Override
    public void calculateArea() {

        float areaOfCircle = pie * radius * radius;
        System.out.println("Area of Circle = " + areaOfCircle);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");

    }

    @Override
    public String getName() {

        return shapeName;

    }
}
