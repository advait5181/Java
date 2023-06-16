package SetImplementationsExcersize;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetDemo9 {
    public static void main(String[] args) {

        //9. Write a Java program to convert a hash set to a List/ArrayList.

        HashSet set = new HashSet();

        set.add("Red");
        set.add("Black");
        set.add("Blue");
        set.add("Green");
        set.add("Pink");
        set.add("Yellow");

        System.out.println("Original hashset element :"+ set);

        List list = new ArrayList(set);

        System.out.println("Arraylist contain :"+ list);
    }
}
