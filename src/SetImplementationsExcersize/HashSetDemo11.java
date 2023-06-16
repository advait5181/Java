package SetImplementationsExcersize;

import java.util.HashSet;

public class HashSetDemo11 {
    public static void main(String[] args) {

        //11. Write a Java program to compare two sets and retain elements which are same on both sets.

        HashSet set = new HashSet();

        set.add("Red");
        set.add("Green");
        set.add("Blue");
        set.add("Yellow");

        System.out.println("First hashset contain:"+ set);

        HashSet set1 = new HashSet();

        set1.add("Red");
        set1.add("Black");
        set1.add("Pink");
        set1.add("Blue");

        System.out.println("Second hashset contain:"+ set1);

        set.retainAll(set1);
        System.out.println("Hashset contain ");
        System.out.println(set);
    }
}
