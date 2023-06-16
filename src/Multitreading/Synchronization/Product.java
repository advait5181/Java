package Multitreading.Synchronization;

public class Product {
    synchronized void Produce(){
        try{
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Product is produce"+Thread.currentThread().getName());

          try{
              wait();
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
    }

    synchronized void Consume(){
        try{
            Thread.sleep(50000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("product is Consumed"+Thread.currentThread().getName());
        notify();
    }

    public void start() {
    }
}
