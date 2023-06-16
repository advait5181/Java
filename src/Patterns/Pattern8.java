package Patterns;

public class Pattern8 {
    public static void main(String[] args) {

        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print((i+j+1)%2+" ");
            }
            System.out.println();
        }
    }
}
