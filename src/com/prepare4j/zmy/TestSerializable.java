package com.prepare4j.zmy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestSerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
          * 序列化
          */
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\serialzation.out");
        //代码中ObjectOutputStream把list输出成Byte流 字节流，并存到serialzation.out文件中。
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<1000;i++){
            list.add(i);
        }
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("d:\\serialzation.out");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Integer> lsit = (List<Integer>) objectInputStream.readObject();
        System.out.println(lsit);
        fileInputStream.close();
        objectInputStream.close();
    }

}
