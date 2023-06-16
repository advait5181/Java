package CollectionFramework.SetImplementations;


import java.util.HashSet;
import java.util.Set;

public class HashSetDemo2 {
    public static void main(String[] args) {

        Set<Product> set = new HashSet<>();

        set.add(new Product(11,23,45,"Charger"));
        set.add(new Product(12,24,46,"Laptop"));
        set.add(new Product(13,25,47,"Bottle"));
        set.add(new Product(14,26,48,"Table"));
        set.add(new Product(15,27,48,"Cables"));

        set.forEach(System.out::println);
    }
}
