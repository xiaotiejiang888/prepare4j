package com.prepare4j.zmy.scriptengine;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import static java.lang.System.err;
import static java.lang.System.out;

public class Engine1 {
    public static void main(String args[]) {
        ScriptEngineManager manager = new ScriptEngineManager();
        // 建立javascript脚本引擎
        ScriptEngine engine = manager.getEngineByName("javascript");
        try {
            // 将变量name和变量值abcdefg传给javascript脚本

            engine.put("applyMoney",  500);
            // 开始执行脚本

            engine.eval("var output =0 ;" +
                    "output = applyMoney;");
            // 得到output变量的值

            int name = Integer.valueOf(engine.get("output").toString());
            out.printf("被翻转后的字符串：%s", name);
        } catch (ScriptException e) {
            err.println(e);
        }
    }
}