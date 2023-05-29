package CollectionPackage.ArrayListPackage;

import objectOrientedPackage.constructorTC.Person;

import java.util.ArrayList;

public class TC_2 {

    public static void main(String[] args) {

        ArrayList<Person> arrPerson = new ArrayList<>();

        Person p1 = new Person("P1",20);
        Person p2 = new Person("P2", 25);

        arrPerson.add(p1);
        arrPerson.add(p2);

        Person arrayZeroIndex = arrPerson.get(0);
        Person arrayFirstIndex = arrPerson.get(1);

        System.out.println(arrayZeroIndex);
        System.out.println(arrayFirstIndex);
    }
}
