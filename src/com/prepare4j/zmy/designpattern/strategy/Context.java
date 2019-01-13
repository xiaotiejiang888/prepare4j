package com.prepare4j.zmy.designpattern.strategy;

public class Context
{
    private Strategy strategy;

    public Context(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public void strategyMethod()
    {
        strategy.useStrategy();
    }
}