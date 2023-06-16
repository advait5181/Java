package Patterns;

public class Pattern10 {
    public static void main(String[] args) {

        // 1 1 1 1 1
        // 2 2 2 2
        // 3 3 3
        // 4 4
        // 5

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=6-i ; j++) {
                System.out.print("j"+" ");
            }
            System.out.println();
        }
    }
}
