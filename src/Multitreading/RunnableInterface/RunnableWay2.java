package Multitreading.RunnableInterface;

public class RunnableWay2 {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Anonymous"+Thread.currentThread().getName()+" "+i);
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.setName("Worker");
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
