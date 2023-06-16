package CollectionFramework.SetImplementations;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo2 {
    public static void main(String[] args) {

        Set<Product> set = new LinkedHashSet<>();

        set.add(new Product(11,23,45,"Charger"));
        set.add(new Product(12,24,46,"Laptop"));
        set.add(new Product(13,25,47,"Bottle"));
        set.add(new Product(14,26,48,"Table"));
        set.add(new Product(15,27,48,"Cables"));

        set.forEach(System.out::println);
    }
}
