package ListImplementations;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        // 2.Write a Java program to retrieve an element (at a specified index) from a given array list.

        List arrayList = new ArrayList();

        arrayList.add("Red");
        arrayList.add("Black");
        arrayList.add("Blue");
        arrayList.add("Yellow");

        System.out.println(arrayList);

        String element = (String) arrayList.get(0);
        System.out.println("First Element:"+element);

        element = (String) arrayList.get(2);
        System.out.println("Third element:"+element);
    }
}
