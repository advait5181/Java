package SetImplementationsExcersize;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo8 {
    public static void main(String[] args) {

        //8. Write a Java program to convert a hash set to a tree set.

        HashSet set = new HashSet();

        set.add("Red");
        set.add("Black");
        set.add("Blue");
        set.add("Green");
        set.add("Pink");
        set.add("Yellow");

        System.out.println("Original hashset is :"+ set);

        TreeSet<String> tree_Set = new TreeSet<String>(set);

        System.out.println("TreeSet element:");
        for (String element: tree_Set) {
            System.out.println(element);
        }
    }
}
