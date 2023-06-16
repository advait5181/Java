package SetImplementationsTreeSetExcersize;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        //2. Write a Java program to create a reverse order view of the elements contained in a given tree set..

        TreeSet set = new TreeSet();

        set.add("Red");
        set.add("Blue");
        set.add("Yellow");

        System.out.println("Original treeSet "+set);

        Iterator it = set.descendingIterator();

        System.out.println("Element in Reverse order");

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
