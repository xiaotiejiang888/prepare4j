package com.prepare4j.zmy;

public class Test2 {
    public static void main(String[] args) {
        String s1 = "qwerabcdtyuiop";
        String s2 = "xcabcdvbn";
        String stringMax = stringMax(s1, s2);
        System.out.println("最大的相同子字符串是：" + stringMax);
    }

    private static String stringMax(String s1, String s2) {
        //*******第一步 找到比较小的那一个  保证s2是比较小的那个*******
        //最大相同子串，s1,s2=min
        String max=(s1.length()>s2.length())?s1:s2;
        String min=(max==s1)?s2:s1;
        //*******第二步 找到比较小的那一个  保证s2是比较小的那个*******
        if (s1.contains(s2)){
            return s2;
        }
        int length = s2.length();
//        把较短字符串先与长的contains，存在则输出；不存在则减一再contains
        for (int j = 0;j<length;j++){
            //控制要减得长度
            // 控制初始和结尾，同时向右平移，且不让结尾超出长字符串
            for (int startIndex = 0, endIndex = length - j; endIndex != length + 1; startIndex++, endIndex++){
                String str = s2.substring(startIndex,endIndex);
                if (s1.contains(str)){
                    return str;
                }
            }
        }
        return "";
    }
}
