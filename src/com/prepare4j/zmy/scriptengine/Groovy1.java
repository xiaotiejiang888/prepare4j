package com.prepare4j.zmy.scriptengine;


import javax.script.*;
import java.util.Date;

public class Groovy1 {
    public static void main(String[] args) throws ScriptException, NoSuchMethodException{
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("groovy");
        String fact = "(os=='02'&&brand=='HONOR'&&model=='LLD-AL20'&&version>3)?grayTargetVersion:version";
        engine.eval(fact);
        Invocable inv = (Invocable) engine;
        Object[] params = { new Integer(5),"ssss"};
        Object result = inv.invokeFunction("factorial", params);
        System.out.println(result);

//        Bindings binding = engine.createBindings();
//        binding.put("date", new Date());
//        engine.eval("def getTime(){return date.getTime();}",binding);
//        engine.eval("def sayHello(name,age){return 'Hello,I am ' + name + ',age ' + age;}");
//        Object time = inv.invokeFunction("getTime", null);
//        System.out.println((Long) time);
//        String message = (String)inv.invokeFunction("sayHello", "zhangsan",new Integer(12));
//        System.out.println(message);
    }
}
