package Multitreading.Synchronization;


public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

           Thread thread = new Thread(()->{
               for (int i = 0; i < 20000; i++) {
                   counter.incrementCount();
               }
           },"Thread");

            Thread thread1 = new Thread(()->{
                for (int i = 0; i < 20000; i++) {
                    counter.incrementCount();
                }
            },"Thread");
            thread.start();
            thread1.start();

            thread.join();
            thread.join();

        System.out.println("Total Count"+Counter.count);
    }
}
