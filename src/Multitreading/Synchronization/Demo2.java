package Multitreading.Synchronization;

public class Demo2 {
    public static void main(String[] args) {
        Product product = new Product();

        Thread produce = new Thread(()->{
           while(true){
               product.Produce();
           }
        },"Produce");

        Thread consumer = new Thread(()->{
            while(true){
                  product.Consume();
            }
        },"Consumer");

        product.start();
       consumer.start();
    }
}
