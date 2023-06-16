package Patterns;

public class Pattern7 {
    public static void main(String[] args) {

        // a
        // b b
        // c c c
        // d d d d
        // e e e e e

        char ch ='a';
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
    }
}
