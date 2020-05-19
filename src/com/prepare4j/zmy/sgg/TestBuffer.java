package com.prepare4j.zmy.sgg;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class TestBuffer {
    public static void main(String[] args) {
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        int limit = allocate.limit();
    }

}
