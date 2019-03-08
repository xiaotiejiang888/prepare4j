package com.prepare4j.zmy.scriptengine;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import static java.lang.System.err;
import static java.lang.System.out;

/**
 * function myFunction(applyMoney)
 * {
 *     var output ='' ;
 * 	output = applyMoney;
 * 	alert(output)
 * }
 */


//http://www.runoob.com/try/try.php?filename=tryjs_function_xx
public class Engine2 {
    public static void main(String args[]) {
        ScriptEngineManager manager = new ScriptEngineManager();
        // 建立javascript脚本引擎
        ScriptEngine engine = manager.getEngineByName("javascript");
        try {
            // 将变量name和变量值abcdefg传给javascript脚本

            engine.put("applyMoney",  80);
            engine.put("maxMoney",  100);
            // 开始执行脚本

            engine.eval("var output = 0;" +
                    "if(applyMoney >= maxMoney){" +
                    "output = maxMoney;" +
                    "}else{" +
                    "output = applyMoney;" +
                    "}");
            // 得到output变量的值

            int money = Integer.valueOf(engine.get("output").toString());
            out.println("应报金额："+ money);
        } catch (ScriptException e) {
            err.println(e);
        }
    }
}