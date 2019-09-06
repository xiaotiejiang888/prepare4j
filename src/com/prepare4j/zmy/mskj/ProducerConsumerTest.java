package com.prepare4j.zmy.mskj;

public class ProducerConsumerTest {
    public static void main(String args[]) {
        FoodList foodList = new FoodList ();
        new Thread(new Cooker (foodList)).start();//生产者线程
        new Thread(new Cooker (foodList)).start();//生产者线程
        new Thread(new Cooker (foodList)).start();//生产者线程
        new Thread(new Server(foodList)).start();//消费者线程
        new Thread(new Server (foodList)).start();//消费者线程
    }
}
