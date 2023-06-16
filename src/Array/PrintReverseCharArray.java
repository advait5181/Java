package Array;

public class  PrintReverseCharArray {
    public static void main(String[] args) {

        String name = "welcome to cyber success";
        char [] array = name.toCharArray();

        for (int left = 0, right = array.length - 1; left < right; left++, right--) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
        for (char c : array) {
            System.out.print(c + " ");
        }

    }
}
