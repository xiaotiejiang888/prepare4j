package com.prepare4j.zmy.prepare4gf;

import com.prepare4j.zmy.prepare4gf.diyThread.MyThreadFactory;

import java.text.ParseException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.*;

//https://blog.csdn.net/nicolastsuei/article/details/84628873

public class LocalDateTimeTest {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss");

    public static String formatDate2(LocalDateTime date) {
        return formatter.format(date);
    }

    public static LocalDateTime parse2(String dateNow) {
        return LocalDateTime.parse(dateNow, formatter);
    }

    public static void main(String[] args) throws InterruptedException, ParseException {

//        MyThreadFactory myFactory=new MyThreadFactory("MyThreadFactory");
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5,
//                0L, TimeUnit.MILLISECONDS,
//                new LinkedBlockingQueue<Runnable>(100), myFactory);
//
//        //  20个线程
//        for (int i = 0; i < 20; i++) {
//            threadPoolExecutor.execute(() -> {
//                for (int j = 0; j < 10; j++) {
//                    try {
//                        System.out.println(Thread.currentThread().getName()+ " "+parse2(formatDate2(LocalDateTime.now())));
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//        }
//        //  等待上述的线程执行完
//        threadPoolExecutor.shutdown();
//        threadPoolExecutor.awaitTermination(1, TimeUnit.DAYS);
        System.out.println(formatDate2(LocalDateTime.now()));

    }
}
