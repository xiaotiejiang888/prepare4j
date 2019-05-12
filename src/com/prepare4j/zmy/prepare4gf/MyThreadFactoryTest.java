package com.prepare4j.zmy.prepare4gf;

import com.prepare4j.zmy.prepare4gf.diyThread.MyTask;
import com.prepare4j.zmy.prepare4gf.diyThread.MyThreadFactory;
//https://blog.csdn.net/nicolastsuei/article/details/84628873
public class MyThreadFactoryTest {
    public static void main(String[] args) throws InterruptedException {
        MyThreadFactory myFactory=new MyThreadFactory("zmyThreadFactory");
        MyTask task=new MyTask();
        Thread thread=myFactory.newThread(task);
        thread.start();
        thread.join();


        System.out.printf("Main: Thread information.\n");

        System.out.printf("%s\n",thread);

        System.out.printf("Main: End of the example.\n");

    }
}
