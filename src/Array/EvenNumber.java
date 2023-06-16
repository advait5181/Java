package Array;

public class EvenNumber {
    public static void main(String[] args) {
        int [] array = {1,2,4,5,7,8,9,10,12,17};

        for (int i : array) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
