package Array;

public class AccessingSetting {
    public static void main(String[] args) {
         int [] array = {1,2,3,4,5,7};

         array[2] = 100;

        for (int i : array) {
            System.out.println(i);
        }
    }
}
