package Array;

public class PrintReverseArray {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};

        for (int index = array.length-1; index >=0 ; index--) {
            System.out.print(array[index]+" ");
        }
    }
}
