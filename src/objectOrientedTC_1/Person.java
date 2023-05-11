package objectOrientedTC_1;

public class Person {

    String name = "";
    int age = 0;
    public Person(int i, String s) {
        this.name = s;
        this.age = i;
    }

    public Person(String s, int i) {
        this.name = s;
        this.age = i;
    }

    public Person(String s1) {
        this.name = s1;
    }

    public void summaryOfUser() {
        if (age == 0) {
            System.out.println("My name is " + name);
        } else {

            System.out.println("My name is " + name + " age is " + age);
        }

    }


}

