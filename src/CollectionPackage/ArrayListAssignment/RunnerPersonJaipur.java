package CollectionPackage.ArrayListAssignment;

// Todays assignment, Create class person, with name and age,
// create 10 objects of person with some random name and age, create list of person,
// add all person objects to list, create another list,
// loop over the original list and add only those person objects whose name stars with S
// and print both original and filtered list

import java.util.ArrayList;
import java.util.Scanner;

public class RunnerPersonJaipur {

    public static void main(String[] args) {

        ArrayList<PersonOfJaipur> arrayOfPersonOfJaipur = new ArrayList<>();

//        PersonOfJaipur p1 = new PersonOfJaipur("Shubham", 28);
//        PersonOfJaipur p2 = new PersonOfJaipur("Vaibhav", 24);
//        PersonOfJaipur p3 = new PersonOfJaipur("Mayank", 25);
//        PersonOfJaipur p4 = new PersonOfJaipur("Sumit", 23);
//
//        PersonOfJaipur s = new PersonOfJaipur("Sourabh", 30);
//        PersonOfJaipur s1 = new PersonOfJaipur("Shivam", 25);
//
//        PersonOfJaipur r = new PersonOfJaipur("Ravi", 26);
//        PersonOfJaipur r1 = new PersonOfJaipur("Ramu",30);

//        arrayOfPersonOfJaipur.addAll(arrayOfPersonOfJaipur);

//        arrayOfPersonOfJaipur.add(p1);
//        arrayOfPersonOfJaipur.add(p2);
//        arrayOfPersonOfJaipur.add(p3);
//        arrayOfPersonOfJaipur.add(p4);
//        arrayOfPersonOfJaipur.add(s);
//        arrayOfPersonOfJaipur.add(s1);
//        arrayOfPersonOfJaipur.add(r);
//        arrayOfPersonOfJaipur.add(r1);



        for(int i =0; i<4;i++){

            Scanner sc = new Scanner(System.in);
            System.out.println("Provide person's name");
            String name = sc.next();
            System.out.println("Provide person's age ");
            int age = sc.nextInt();

            PersonOfJaipur person = new PersonOfJaipur(name,age);

            arrayOfPersonOfJaipur.add(person);
        }

        System.out.println(arrayOfPersonOfJaipur);

        ArrayList<PersonOfJaipur> filterArrayList = new ArrayList<>();


        for( PersonOfJaipur person : arrayOfPersonOfJaipur){

            if(person.getName().startsWith("S")){

            filterArrayList.add(person);
            }

        }

        System.out.println(filterArrayList);


    }
}
