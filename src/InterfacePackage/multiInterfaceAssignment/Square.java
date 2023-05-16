package InterfacePackage.multiInterfaceAssignment;

public class Square implements Shape, Drawable {
    String shapeName;
    int side;

    public Square(String shapeName, int side) {

        this.side = side;
        this.shapeName=shapeName;
    }

    @Override
    public void calculatePerimeter() {

        int perimeterOfSquare = 4 * side;
        System.out.println("Perimeter of Square " + perimeterOfSquare);

    }

    @Override
    public void calculateArea() {

        int areaOfSquare = side * side;
        System.out.println("Area of Square = " + areaOfSquare);

    }

    @Override
    public void draw() {
        System.out.println("Drawing Square");

    }

    @Override
    public String getName() {

        return shapeName;
    }
}
