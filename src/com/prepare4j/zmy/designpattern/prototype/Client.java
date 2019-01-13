package com.prepare4j.zmy.designpattern.prototype;

/** https://www.cnblogs.com/xrq730/p/4905907.html
 * 原型模式的优点
 *
 * 原型模式是一种类的创建模式，可以看到到目前为止的四种创建型模式，
 * 客户端（调用方）都没有直接new一个类实例出来。把new一个类实例的动作由客户端（调用方）交给别人做而不是自己做，
 * 这就是创建型模式的宗旨。
 * 使用原型模式创建对象比直接new一个对象在性能上好得多，
 * 因为Object类的clone()方法是一个native方法，它直接操作内存中的二进制流，特别是复制大对象时，性能的差别非常明显。
 * 使用原型模式的另一个好处是简化对象的创建，使得创建对象就像普通的复制黏贴一样简单。
 */
public class Client
{
    public static void main(String[] args)
    {
        ConcretePrototype cp = new ConcretePrototype();
        for (int i = 0; i < 10; i++)
        {
            ConcretePrototype clonecp = (ConcretePrototype)cp.clone();
            clonecp.show();
        }
    }
}