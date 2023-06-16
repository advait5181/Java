package Multitreading;

public class Task extends Thread {
    @Override
    public void run() {
        System.out.println("Run method");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
