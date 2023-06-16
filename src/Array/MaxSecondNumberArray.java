package Array;

public class MaxSecondNumberArray {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7};

        int max = Integer.MIN_VALUE;
        for (int j : array) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println("Max Number is ="+max);
    }
}
