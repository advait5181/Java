package Patterns;

public class Pattern5 {
    public static void main(String[] args) {

        // a
        // a b
        // a b c
        // a b c d
        // a b c d e

        for (int i = 1; i <=5 ; i++) {
            char ch = 'a';
            for (int j = 1; j <=i ; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
