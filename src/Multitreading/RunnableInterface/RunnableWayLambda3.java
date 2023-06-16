package Multitreading.RunnableInterface;

public class RunnableWayLambda3 {
    public static void main(String[] args) {

        new Thread (()-> System.out.println("Lambda Working"),"Lambda").start();
    }
}
