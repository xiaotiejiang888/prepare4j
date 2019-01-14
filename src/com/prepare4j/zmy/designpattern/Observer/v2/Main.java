package com.prepare4j.zmy.designpattern.Observer.v2;

/**
 * 看到主题对象改变的时候，观察者对象的状态也随之改变
 *
 * 观察者模式的优点以及实际应用
 *
 * https://www.cnblogs.com/xrq730/p/4908686.html
 * 引入设计模式最主要的作用我认为就是两点：
 * 1、去重复代码，使得代码更清晰、更易读、更易扩展
 * 2、解耦，使得代码可维护性更好，修改代码的时候可以尽量少改地方
 * 使用观察者模式可以很好地做到这两点。增加观察者，直接new出观察者并注册到主题对象之后就完事了，删除观察者，主题对象调用方法删除一下就好了，其余都不用管。主题对象状态改变，内部会自动帮我们通知每一个观察者，是不是很方便呢？
 * 观察者模式主要应用场景有：
 * 1、对一个对象状态的更新需要其他对象同步更新
 * 2、对象仅需要将自己的更新通知给其他对象而不需要知道其他对象的细节，如消息推送
 */
public class Main {
    public static void main(String[] args)
    {
        /** 创建被观察者对象 */
        Watched watched = new Watched();

        /** 创建观察者对象，并将被观察者对象登记 */
        Watcher watcher = new Watcher(watched);
        Watcher watcher2 = new Watcher(watched);

        /** 给被观察者状态赋值 */
        watched.setData("start");
        watched.setData("run");
        watched.setData("stop");
    }
}
