package Array;

import java.util.Arrays;

public class AccessElement {
    public static void main(String[] args) {
        int [] array = {10,20,30,40,50};

        System.out.println(Arrays.toString(array));

        System.out.println(array.length);

        for (int i : array) {
            System.out.println(i);
        }
        System.out.println(array[-1]);
    }
}
