package Multitreading.RunnableInterface;

public class ByPassingRunnableParameter implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "Class");
        }
    }

    public static void main(String[] args) {
        ByPassingRunnableParameter bypassingrunnableparameter = new ByPassingRunnableParameter();
        Thread thread = new Thread(bypassingrunnableparameter);
        Thread thread1 = new Thread(new Runnable(){

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Anonymous class");
                }
            }
        });

        thread.start();
        thread1.start();
        thread.setName("Hello");

        for (int i = 0; i < 10; i++) {
            System.out.println("main method"+Thread.currentThread().getName());
        }
    }
}