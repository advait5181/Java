package CollectionFramework.SetImplementations;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {

        Set<Integer> it = new TreeSet<>();

        it.add(100);
        it.add(200);
        it.add(300);
        it.add(400);
        it.add(400);

        System.out.println(it);
    }
}
