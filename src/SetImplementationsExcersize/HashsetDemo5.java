package SetImplementationsExcersize;

import java.util.HashSet;

public class HashsetDemo5 {
    public static void main(String[] args) {

        //5. Checking hashset is empty or not

        HashSet set = new HashSet();

       set.add("Red");
       set.add("Blue");
       set.add("Black");
       set.add("Green");

        System.out.println("Original hashset is :"+set);

        System.out.println("Checking given hashset is empty or not::"+ set.isEmpty());

        set.removeAll(set);
        System.out.println("After removing hashset:"+set);
    }
}
