package ListImplementations;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo5 {
    public static <list> void main(String[] args) {
        // 3.Write a Java program to remove the third element from a array list.

        List arrayList = new ArrayList();

         arrayList.add("red");
         arrayList.add("Back");
         arrayList.add("White");
         arrayList.add("Orange");
        System.out.println(arrayList);

        arrayList.remove(2);
        System.out.println("After removing the color \n"+arrayList);
    }
}
