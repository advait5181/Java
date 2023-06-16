package Multitreading.RunnableInterface;

public class RunnableWay3 {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Anonymous"+Thread.currentThread().getName()+" "+i);
                }
            }
        });
        thread.setName("Worker");
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
