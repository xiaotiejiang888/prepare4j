package com.prepare4j.zmy.luanma;

import java.io.*;

public class TestUnicode {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        String s = "简介";
//        System.out.println(s+" --的unicode编码是："+gbEncoding(s));
//        System.out.println(gbEncoding(s) + " --转换成中文是："+decodeUnicode(gbEncoding(s)));

        //System.out.println(gbEncoding(s) + " --转换成中文是："+decodeUnicode("\\u7b80\\u4ecb"));
        String gbString = "\u7ae0\u8302\u745c";
        String gbString2 = "\\\u7ae0\\\u8302\\\u745c";
        String s = readFile("D:\\workspace\\java\\prepare4j\\src\\com\\prepare4j\\zmy\\luanma\\alarmConfig.Properties");
        System.out.println(s.equals(gbString));
        System.out.println(s.equals(gbString2));
        System.out.println(decodeUnicode(gbEncoding(s)));

        System.out.println(decodeUnicode(gbEncoding(gbString)));
    }

    /**
     * 读入TXT文件
     */
    public static String readFile(String pathname) {
        //防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw;
        //不关闭文件会导致资源的泄露，读写文件都同理
        //Java7的try-with-resources可以优雅关闭文件，异常时自动关闭文件；详细解读https://stackoverflow.com/a/12665271
        try (FileReader reader = new FileReader(pathname);
             BufferedReader br = new BufferedReader(reader) // 建立一个对象，它把文件内容转成计算机能读懂的语言6
        ) {
            String line;
            //网友推荐更加简洁的写法
            while ((line = br.readLine()) != null) {
                // 一次读入一行数据
                return line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }


    /*
     * 中文转unicode编码
     */
    public static String gbEncoding(final String gbString) {
        char[] utfBytes = gbString.toCharArray();
        String unicodeBytes = "";
        for (int i = 0; i < utfBytes.length; i++) {
            String hexB = Integer.toHexString(utfBytes[i]);
            if (hexB.length() <= 2) {
                hexB = "00" + hexB;
            }
            unicodeBytes = unicodeBytes + "\\u" + hexB;
        }
        return unicodeBytes;
    }
    /*
     * unicode编码转中文
     */
    public static String decodeUnicode(final String dataStr) {
        int start = 0;
        int end = 0;
        final StringBuffer buffer = new StringBuffer();
        while (start > -1) {
            end = dataStr.indexOf("\\u", start + 2);
            String charStr = "";
            if (end == -1) {
                charStr = dataStr.substring(start + 2, dataStr.length());
            } else {
                charStr = dataStr.substring(start + 2, end);
            }
            char letter = (char) Integer.parseInt(charStr, 16); // 16进制parse整形字符串。
            buffer.append(new Character(letter).toString());
            start = end;
        }
        return buffer.toString();
    }
}
