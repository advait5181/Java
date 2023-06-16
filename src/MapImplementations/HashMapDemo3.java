package MapImplementations;

import java.util.LinkedHashMap;

public class HashMapDemo3 {
    public static void main(String[] args) {

        // creating linked-hashmap on other map:

        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();

        map.put("ABC",3);
        map.put("CVB",8);

        System.out.println("LinkedHashMap:"+map);

        LinkedHashMap<String,Integer> numbers = new LinkedHashMap<>(map);

        numbers.put("SDF",5);

        System.out.println("LinkedHashMap1:"+numbers);
    }
}
