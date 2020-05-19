package com.prepare4j.zmy.ScriptEngineManager;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class JieXi
{
    public static void main(String[] args) throws Exception {
        String str = "(a or b) and c";
        str = str.replaceAll("or", "||");
        str = str.replaceAll("and", "&&");
        System.out.println(str);
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        engine.put("a",true);
        engine.put("b",false);
        engine.put("c",true);
        Object result = engine.eval(str);
        System.out.println("结果类型:" + result.getClass().getName() + ",计算结果:" + result);

    }
}