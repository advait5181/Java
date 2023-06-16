package Multitreading.RunnableInterface;

public class RunnableWayLambda2 {
    public static void main(String[] args) {

        Runnable referenceOfTypeRunnable = ()-> System.out.println("Lambda Working"+Thread.currentThread().getName());



        Thread thread = new Thread(()-> System.out.println("Lambda Working"+Thread.currentThread().getName()),"Lambda");
        thread.start();
    }
}
