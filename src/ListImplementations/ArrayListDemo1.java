package ListImplementations;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        List arrayList = new ArrayList();

        arrayList.add(10);
        arrayList.add(10);
        arrayList.add("String");
        arrayList.add("String");
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(10.5f);
        arrayList.add(10.5d);
        arrayList.add(true);


        boolean isRemoved = arrayList.remove("String");
        System.out.println(isRemoved);

        System.out.println("No. of element in the Collection "+arrayList.size());
        System.out.println(arrayList);
        System.out.println(arrayList.contains("String"));
    }
}
