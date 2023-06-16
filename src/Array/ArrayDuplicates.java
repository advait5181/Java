package Array;

public class ArrayDuplicates {
    public static void main(String[] args) {

        int [] array = {10,20,30,40,40};

        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                          found = true;
                          break;
                }
            }

            if (found) {
                      break;
            }
        }
        System.out.println(found?"found":"not found");
    }
}
