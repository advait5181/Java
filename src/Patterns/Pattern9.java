package Patterns;

public class Pattern9 {
    public static void main(String[] args) {

        // Reverse Pattern :

        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=6-i ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
