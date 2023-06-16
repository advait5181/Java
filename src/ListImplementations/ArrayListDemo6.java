package ListImplementations;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        //4. Search Element in given ArrayList.

        List arrayList = new ArrayList();

        arrayList.add("Red");
        arrayList.add("White");
        arrayList.add("Black");
        arrayList.add("orange");

        System.out.println(arrayList);
        if (arrayList.contains("White")){
            System.out.println("Found the element");
        }
        else{
            System.out.println("Element is Not Found");
        }

    }
}
