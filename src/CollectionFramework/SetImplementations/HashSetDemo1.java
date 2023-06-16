package CollectionFramework.SetImplementations;

import java.util.HashSet;
//import java.util.Set;

public class HashSetDemo1 {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);
        set.add(500);
        set.add(null);
        set.add(null);
        System.out.println(set);
    }
}
