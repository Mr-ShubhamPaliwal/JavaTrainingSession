package objectOrientedPackage;

public class CallPerson {

    public static void main(String[] args) {


        Person personObject= new Person(25,"Shubham");

        Person personObject2= new Person("Paliwal");

        personObject.summaryOfUser();

       personObject2.summaryOfUser();
    }
}
