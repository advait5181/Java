package Array;

public class MinNumberArray {
    public static void main(String[] args) {

        int [] array = {1,9,191,109,1980};

        int min = Integer.MAX_VALUE;
        for (int j : array) {
            if (min > j) {
                min = j;
            }
        }
        System.out.println("Min Number is ="+min);
    }
}
