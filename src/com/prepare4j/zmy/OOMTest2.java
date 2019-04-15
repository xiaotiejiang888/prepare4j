package com.prepare4j.zmy;

import java.util.ArrayList;
import java.util.List;

public class OOMTest2 {
    public static void main(String... args){
        List<byte[]> buffer = new ArrayList<byte[]>();
        buffer.add(new byte[10*1024*1024]);
    }
}
