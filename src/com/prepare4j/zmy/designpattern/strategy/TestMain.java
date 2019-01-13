package com.prepare4j.zmy.designpattern.strategy;

/**
 * 策略模式
 * 策略模式的用意是针对一组算法，将每一个算法封装到具有共同接口的独立类中，从而使得它们可以相互替换。
 * 策略模式使得算法可以在不影响到客户端的情况下发生变化。
 *
 * Comparator这个接口简直就是为策略模式而生的
 * 比方说Collections里面有一个sort方法，因为集合里面的元素有可能是复合对象，复合对象并不像基本数据类型，可以根据大小排序，复合对象怎么排序呢？基于这个问题考虑，Java要求如果定义的复合对象要有排序的功能，就自行实现Comparable接口或Comparator接口
 */
public class TestMain
{
    public static void main(String[] args)
    {
        Strategy strategyA = new StrategyA();
        Strategy strategyB = new StrategyB();

        Context context = new Context(strategyA);
        context.strategyMethod();
        context = new Context(strategyB);
        context.strategyMethod();
    }
}