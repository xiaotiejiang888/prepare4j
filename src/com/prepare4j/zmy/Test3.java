package com.prepare4j.zmy;

public class Test3 {
    // 找一个字符串的最大子串
    public static void main(String[] args) {

        String s1 = "qwerabcdtyuiop";
        String s2 = "xcabcdvbn";
        String stringMax = stringMax(s1, s2);
        System.out.println("最大的相同子字符串是：" + stringMax);
    }

    /**
     * 找出两个字符串中最大的相同子字符串
     *
     * @param s1
     * @param s2
     * @return
     */
    private static String stringMax(String s1, String s2) {
        // 记录相同子字符串
        String sameString = null;
        // 比较两个字条串的长度，这里是设置S1的长度大于S2的长度
        if (s1.length() < s2.length()) {
            // 如果s2的长度大，那么就将两个字符串进行替换
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }
        // 如果s2就被包含在s1中，那么这两个字符串最大的子串就是s2
        boolean isContains = s1.contains(s2);

        if (isContains) {
            return s2;
        } else {
            boolean b1 = false;
            int m = 0;
            // 如果s2不是两个字符串最大的子类，那么再进行循环查找
//            xcabcdvbn
            for (int i = 0; i < s2.length(); i++) {
                for (int j = 0; j <= i; j++) {
                    // 获取每次进行比较的子字条串
                    String str = s2.substring(j, s2.length() - i + j);
                    System.out.println("i=" + i +" j="+j + "次比较：" + str);
                    System.out.println("mmm第" + m + "次比较");
                    m++;
                    if (s1.contains(str)) {
                        sameString = str;
                        b1 = true;
                        break;
                    }

                }
                // 如果比较到s2中最小的为2的时候还没有相同的字符串，我们就默认没相同的子字符串
                if (s2.substring(0, s2.length() - i).length() == 2) {
                    System.out.println("没有相同的子字符串");
                    b1 = true;
                    break;

                }
                if (b1 == true)
                    break;
            }
        }
        return sameString;
    }
}
