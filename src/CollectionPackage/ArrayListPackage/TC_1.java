package CollectionPackage.ArrayListPackage;

import java.util.ArrayList;

public class TC_1 {
    public static void main(String[] args) {

        // <String> indicates that String object will be added to ArrayList, its part of java generics

        ArrayList <String> arrayList = new ArrayList<>();

        arrayList.add("ent");
        arrayList.add("secondEfirstElemlement");
        arrayList.add("thirdElement");
        arrayList.add("fourthElement");

        String arrayIndexZero = arrayList.get(0);
        System.out.println(arrayIndexZero);

        // It will add "Shubham" at index 2 and shift "thirdElement" & "fourthElement" on next index
        // Means there will be one more element added total element will be 5
        arrayList.add(2,"Shubham");
        String arrayIndexTwo = arrayList.get(2);
        System.out.println(arrayIndexTwo);

        System.out.println(arrayList);

    }


}
