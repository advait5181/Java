package Array;

public class SumOfArray {
    public static void main(String[] args) {
        int [] array = {10,20,30,40,50};
        int sum = 0;

        for (int i : array) {
            sum += i;
        }
        System.out.println("Sum of Element is :"+sum);
    }
}


 //                              or                               //

   //for(int i=0;i<array.length;i++){
   //       sum +=array[i];
   //     }
