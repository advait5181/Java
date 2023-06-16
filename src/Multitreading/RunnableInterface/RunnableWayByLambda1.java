package Multitreading.RunnableInterface;

public class RunnableWayByLambda1 {
    public static void main(String[] args) {

        Thread thread = new Thread(()->{
            for (int i = 0; i < 4; i++) {
                System.out.println("Lambda"+Thread.currentThread().getName()+" "+i);
            }
        });
        thread.setName("Worker");
         thread.start();

        for (int i = 0; i < 4; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
