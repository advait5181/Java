package SetImplementationsExcersize;

import java.util.HashSet;

public class HashSetDemo7 {
    public static void main(String[] args) {

        //7. Write a Java program to convert a hash set to an array.

        HashSet set = new HashSet();

        set.add("Red");
        set.add("Blue");
        set.add("Green");
        set.add("Yellow");
        set.add("Pink");

        System.out.println("original set is :"+ set);

        // converting into array

        String[] new_array = new String[set.size()];
        set.toArray(new_array);

        //displaying array

        System.out.println("Display array ");
        for (String element : new_array) {
            System.out.println(element);
        }
    }
}
