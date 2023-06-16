package CollectionFramework.SetImplementations;


import java.util.HashSet;
import java.util.Set;

public class HashSetDemo3 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Ravi");
        set.add("Vijay");
        set.add("Rahul");
        System.out.println("An Initial element"+set);

        // Removing Specific Element of Hasnset:
        set.remove("Ravi");
        System.out.println("After remove(object) method:"+set);

        Set<String> set1 = new HashSet<>();
        set1.add("Ajay");
        set1.add("Abc");
        set.addAll(set1);
        System.out.println("An updated list:"+set);

        set.removeAll(set1);
        System.out.println("After invoking removeAll() method: "+set);

        //Removing elements on the basis of specified condition
          set.removeIf(str->str.contains("vijay"));
        System.out.println("After removeif() method:"+set);

        set.clear();
        System.out.println("After invoking clear() method: "+set);
    }
}