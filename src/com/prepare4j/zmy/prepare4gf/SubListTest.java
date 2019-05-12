package com.prepare4j.zmy.prepare4gf;

import java.util.ArrayList;
import java.util.List;

public class SubListTest {

    public static void main(String[] args) {
        //先来一个字符串
        String abcd = "abcd";
        //删除字符串前面两个字符
        String cd = abcd.substring(2);
        //true
        System.out.println(cd.equals(cd));
        //false
        System.out.println(abcd.equals(cd));

        //下面的源码很容易解释这个问题，造成这个结果的原因是，生成了一个新的字符串，所以不一样，很正常也容易理解

        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(5);

        List<Integer> list2  = list.subList(0, list.size());
        list2.add(2);
        //true？为什么list截取之后再加元素还是true呢？
        System.out.println(list.equals(list2));
        //如果不明白的话，打印个原来列表的size就明白了，结果是7，原来只有6个元素哦
        System.out.println(list.size());


        //利用这个性质可以实现删除列表中任何位置的连续的一段值，代码如下
        list.subList(0, 2).clear();
        //执行上面这句之后，列表就变成了[2, 4, 1, 5, 2]，删除了前面两个数，列表的大小也变成了5
        System.out.println(list2.size());
        System.out.println(list.size());

        //需要提醒的是，一旦用过subList方法之后，就不要对原来的列表进行任何操作了，
        //否则在对新列表操作时就会出现并发修改异常，这也和这个性质有关

    }
}