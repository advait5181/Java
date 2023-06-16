package SetImplementationsExcersize;

import java.util.HashSet;

public class HashSetDemo4 {
    public static void main(String[] args) {

        //4. Write a Java program to empty an hash set.

        HashSet hashSet = new HashSet();

        hashSet.add("Red");
        hashSet.add("Blue");
        hashSet.add("Black");
        hashSet.add("Green");

        System.out.println("original hashset is :"+ hashSet);

        hashSet.removeAll(hashSet);
        System.out.println("After removing all element form hashset :"+ hashSet);
    }
}
