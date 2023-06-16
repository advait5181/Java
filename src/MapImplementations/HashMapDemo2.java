package MapImplementations;

import java.util.HashMap;

public class HashMapDemo2 {
    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();

        map.put("JAVA",8);
        map.put("HTML",2);
        map.put("CSS",4);

        System.out.println("HashMap:"+ map);
    }
}
