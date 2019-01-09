package com.prepare4j.zmy.designpattern.factory;

/**
 * 简单工厂模式或者说工厂模式的关注点并不在于在工厂中是如何生产出来需要的类的，而在于将创建产品与消费产品分离
 *
 * 工厂模式的优缺点
 *
 * 优点：
 *
 * 1、简单优化了软件体系结构，明确了各自功能模块的职责和权利
 *
 * 2、通过工厂类，外界不需要直接创建具体产品对象，只需要负责消费，不需要关心内部如何创建对象
 *
 * 缺点：
 *
 * 1、改进前的简单工厂模式全部创建逻辑都集中在一个工厂类中，能创建的类只能是考虑到的，如果需要添加新的类，就必须改变工厂类了
 *
 * 2、改进前的简单工厂模式随着具体产品的不断增多，可能会出现共产类根据不同条件创建不同实例的需求，这种对条件的判断和对具体产品类型的判断交错在一起，很难避免功能模块的蔓延，对系统的维护和扩展不利
 *
 * 3、改进后的简单工厂模式主要是使用反射效率会低一些
 */

/**
 * 简单工厂模式在Java中的应用及解读
 *
 * 以后每一篇文章尽可能地介绍设计模式在Java中的应用，因为我认为不是每种设计模式开发者都有机会可以用到，但是能在原有代码中敏锐地看出这是一种什么设计模式，至少能说明对这种设计模式是理解了。这里讲一下JDK中的简单工厂模式。
 *
 * JDK中的简单工厂模式有很多应用，比较典型的比如线程池，具体可以参见Java多线程18：线程池。我们使用线程池的时候，可以使用ThreadPoolExecutor，根据自己的喜好传入corePoolSize、maximumPoolSize、keepAliveTimem、unit、workQueue、threadFactory、handler这几个参数，new出一个指定的ThreadPoolExecutor出来。
 *
 * JDK给开发者提供了Executors这个类，可以让用户产生ThreadPoolExecutor和使用ThreadPoolExecutor分离开，比如可以让Executors提供一个单线程的线程池Executors.newSingleThreadExecutor()、让Executors提供一个无界线程池Executors.newCachedThreadPool()等，这样，开发者可以不用关心线程池是如何去实现的，直接使用Executors方法提供给开发者的ThreadPoolExecutor就可以了。
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Fruit fruit0 = Gardener.getFruit("com.prepare4j.zmy.designpattern.factory.Apple");
        fruit0.grow();
        Fruit fruit1 = Gardener.getFruit("com.prepare4j.zmy.designpattern.factory.Grape");
        fruit1.harveset();
    }
}