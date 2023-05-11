package inheritancePackage.abstractAssignment2;

import java.util.Scanner;

public class CallingPet {

    public static void main(String[] args) {

        Pet objectName=null;

        Scanner sc =new Scanner(System.in);
        System.out.println("Prompt the action of pet ");
        String actionType = sc.next();

        if(actionType.equals("Fly")){
            objectName = new Bird("Parrot");
        }else if(actionType.equals("Bark")){
            objectName = new Dog("German Shepherd");
        }else {
            System.out.println("Invalid action prompted");
        }

        if(objectName !=null)
        {
            objectName.action();
        }


    }
}
