package SetImplementationsExcersize;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo2 {
    public static void main(String[] args) {

        //2.Write a Java program to iterate through all elements in a hash list.

        HashSet set = new HashSet();

        set.add("red");
        set.add("Black");
        set.add("Blue");
        set.add("Green");

        //System.out.println(set);

        Iterator<String> p = set.iterator();

        // iterator the hash set

        while(p.hasNext()){
            System.out.println(p.next());
        }
    }
}
