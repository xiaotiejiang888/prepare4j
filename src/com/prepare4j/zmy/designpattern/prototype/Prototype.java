package com.prepare4j.zmy.designpattern.prototype;

public abstract class Prototype implements Cloneable
{
    public Prototype clone()
    {
        Prototype prototype = null;
        try
        {
            prototype = (Prototype)super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        return prototype;
    }

    public abstract void show();
}