package SetImplementationsExcersize;

import java.util.HashSet;

public class HashSetDemo3 {
    public static void main(String[] args) {

        //3.  Write a Java program to get the number of elements in a hash set.

        HashSet set = new HashSet();

        set.add("100");
        set.add("200");
        set.add("300");
        set.add("400");
        set.add("500");

        System.out.println("Original hashset is :"+ set);

        System.out.println("Size of original hashset is :"+ set.size());
    }
}
