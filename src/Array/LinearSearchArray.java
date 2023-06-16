package Array;

public class LinearSearchArray {
    public static void main(String[] args) {
        int[] array= {1,2,4,5,7,8,9,10,12,17};

        int key = 17;
        boolean ispresent = false;

        int index = 0;

        while (index < array.length){
                 if(key == array[index]){
                     ispresent = true;
                     break;
                 }
                 index++;
        }
        System.out.println(ispresent ?"present":"not present");
    }
}
