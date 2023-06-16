package Multitreading.RunnableInterface;

public class RunnableWay1 {
    public static void main(String[] args) {

        Worker worker = new Worker();

        Thread thread = new Thread(worker);
        thread.setName("worker");
        thread.start();

        System.out.println("Rest of the main");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
