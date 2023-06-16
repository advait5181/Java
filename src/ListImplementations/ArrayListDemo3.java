package ListImplementations;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo3 {
    public static void main(String[] args) {

        // 1.Write a Java program to insert an element into the array list at the first position.
        List arrayList = new ArrayList();

        arrayList.add("Red");
        arrayList.add("White");
        arrayList.add("Black");
        arrayList.add("Blue");

        System.out.println(arrayList);
        // Adding color:

        arrayList.add(0,"Pink");
        arrayList.add(3,"Yellow");

        System.out.println("After adding Color");
        System.out.println(arrayList);
    }
}
