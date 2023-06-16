package SetImplementationsExcersize;

import java.util.HashSet;

public class HashSetDemo6 {
    public static void main(String[] args) {

        //6. Write a Java program to clone a hash set to another hash set.

        HashSet set = new HashSet();

        set.add("Red");
        set.add("Black");
        set.add("Pink");
        set.add("Yellow");
        set.add("Blue");

        System.out.println(set);

        HashSet hashset = new HashSet();

        hashset = (HashSet) hashset.clone();

        System.out.println("After clone :"+ hashset);
    }
}
