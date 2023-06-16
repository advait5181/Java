package SetImplementationsTreeSetExcersize;

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        //1. Write a Java program to add all the elements of a specified tree set to another tree set.

        TreeSet tree_set1 = new TreeSet();

        tree_set1.add("Red");
        tree_set1.add("Blue");
        tree_set1.add("Green");

        System.out.println("Tree set1"+tree_set1);

        TreeSet tree_set2 = new TreeSet();

        tree_set2.add("Yellow");
        tree_set2.add("Pink");
        tree_set2.add("Orange");

        System.out.println("Tree set2"+tree_set2);

        tree_set1.addAll(tree_set2);

        System.out.println("Tree set3"+tree_set1);
    }
}
