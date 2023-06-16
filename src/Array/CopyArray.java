package Array;

public class CopyArray {
    public static void main(String[] args) {

        int [] array = {10,20,30,40,50};
        int [] copy = new int[array.length];

            int i = 0;
            while (i < array.length) {
                copy[i] = array[i];
                i++;
            }

        for (i = 0; i < copy.length; i++) {
            System.out.print(copy[i]+" ");
        }
    }
}

// or take for loop

//         for(i=o;i<array.length;i++){

     //   }