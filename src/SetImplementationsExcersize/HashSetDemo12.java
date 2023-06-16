package SetImplementationsExcersize;

import java.util.HashSet;

public class HashSetDemo12 {
    public static void main(String[] args) {

        //12. Write a Java program to remove all of the elements from a hash set.

        HashSet set = new HashSet();

        set.add("pink");
        set.add("blue");
        set.add("green");
        set.add("yellow");

        System.out.println("Original hashset "+ set);

        set.clear();

        System.out.println("Hashset contain"+ set);
    }
}
