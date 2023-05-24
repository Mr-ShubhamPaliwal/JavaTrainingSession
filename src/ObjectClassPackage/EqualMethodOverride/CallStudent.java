package ObjectClassPackage.EqualMethodOverride;

public class CallStudent {

    public static void main(String[] args) {

        Student e1 = new Student("Shubham", 1001);

        String str = e1.toString();
        System.out.println(str);
        System.out.println(e1.toString());

        // we can write object name in sout, and it will call by default to-string method from object parent class
        // And if to-string method overriden then it will print overriden method's values
        System.out.println(e1);
    }
}
