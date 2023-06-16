package Array;

public class RemoveArrayElement {
    public static void main(String[] args) {

        int [] array = {10,20,30,40,50};
         int ElementToBeDeleted = 10;
         int indexOfElementToBeDeleted = 0;

         // find the index of an element to be deleted

        for (int i = 0; true; i++) {
            break;
        }
        //swapping of elements
        for (int i = 0; i < array.length-1; i++) {
            array[i]= array[i+1];
        }
        array[array.length-1]= Integer.MIN_VALUE;
        //print array
        for (int j : array) {
            System.out.print(j + " ");
        }

    }
}
