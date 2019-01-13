package com.prepare4j.zmy;

/** https://blog.csdn.net/Norte_L/article/details/80250057
 * 值传递和引用传递的理解
 *
 * 基本数据类型传值，对形参的修改不会影响实参；
 * 引用类型传引用，形参和实参指向同一个内存地址（同一个对象），所以对参数的修改会影响到实际的对象。
 * String, Integer, Double等immutable的类型特殊处理，可以理解为传值，最后的操作不会修改实参对象。
 *
 * 引用传递 和 值传递
 * 引用类型：除了在函数传值的时候是"引用传递"，在任何用"＝"向对象变量赋值的时候都是"引用传递"。
 * 值传递：基本类型的传递都属于值传递，和C语言一样，当把Java的基本数据类型（如 int，char，double等）作为入口参数传给函数体的时候，
 * 传入的参数在函数体内部变成了局部变量，这个局部变量是输入参数的一个拷贝，所有的函 数体内部的操作都是针对这个拷贝的操作，
 * 函数执行结束后，这个局部变量也就完成了它的使命，它影响不到作为输入参数的变量。这种方式的参数传递被称为"值 传递"。
 */
public class Example {
    String str = new String("hello");
    char[] ch = {'a', 'b'};
    public static void main(String[] args) {
        Example ex = new Example();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str + " and");
        System.out.println(ex.ch);
    }

    public void change(String str, char[] ch) {
        str = "ok";
        ch[0] = 'c';
    }
}
