package InterfacePackage.multiInterfaceAssignment;

public class Hexagon implements Calculator{

    int length;
    int breadth;

    public Hexagon(int length,int breadth){

        this.length=length;
        this.breadth=breadth;
    }


    @Override
    public void calculatePerimeter() {

        int perimeterOfHexagon = 2*length + 2*breadth;
        System.out.println(perimeterOfHexagon);



    }

    @Override
    public void calculateArea() {




    }
}
