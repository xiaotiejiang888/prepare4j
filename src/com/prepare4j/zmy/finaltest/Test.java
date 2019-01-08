package com.prepare4j.zmy.finaltest;

/**
 * “引用”是Java中非常重要的一个概念，对于引用的理解不深，很容易犯一些自己都没有意识到的错误。被final修饰的变量，不管变量是在是哪种变量，切记不可变的是变量的引用而非引用指向对象的内容。另外，本文中关于final的作用还有两点没有讲到：
 *
 * 1、被final修饰的方法，JVM会尝试为之寻求内联，这对于提升Java的效率是非常重要的。因此，假如能确定方法不会被继承，那么尽量将方法定义为final的，具体参见运行期优化技术的方法内联部分
 *
 * 2、被final修饰的常量，在编译阶段会存入调用类的常量池中，具体参见类加载机制最后部分和Java内存区域
 */
public class Test
{
    public static void main(String[] args)
    {
        FinalString fs = new FinalString("");
        A(fs);
    }

    private static void A(final FinalString fs)
    {
        fs.setStr("123");
        FinalString fss = new FinalString("22");
//        fs = fss;
    }
}