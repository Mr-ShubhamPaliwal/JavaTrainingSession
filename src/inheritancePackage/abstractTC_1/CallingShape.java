package inheritancePackage.abstractTC_1;

import java.util.Scanner;

public class CallingShape {

    public static void main(String[] args) {

        ShapeParent s = null;

        Scanner sc =new Scanner(System.in);
        System.out.println("Which shape you want to draw");
        String shapeType = sc.next();

        if(shapeType.equals("Triangle")){
            s = new TriangleChild("MyTriangle");
        }else if(shapeType.equals("Square")){
            s = new SquareChild("MyTriangle");
        }else {
            System.out.println("Its not a valid input");
        }

        if(s != null){
            s.draw();
        }
    }
}
