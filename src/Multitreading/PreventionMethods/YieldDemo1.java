package Multitreading.PreventionMethods;

public class YieldDemo1 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        },"thread1");
        thread1.setPriority(10);

        Thread thread2 = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        },"thread2");
        thread2.setPriority(10);

        thread1.start();
        thread1.start();

        Thread.yield();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
