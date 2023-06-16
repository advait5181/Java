package Multitreading;

public class Demo1 {
    public static void main(String[] args) {

        Task task = new Task();

        task.setName("ABD");


        task.start();

        System.out.println("Rest of code mein method ");
        System.out.println(10/0);

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
