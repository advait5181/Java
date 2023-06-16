package Multitreading.PreventionMethods;

public class SleepDemo1 {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+i);
            }
        },"Thread");
        thread.start();

        for (int i = 0; i < 100; i++) {
            Thread.sleep(2000L);
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
