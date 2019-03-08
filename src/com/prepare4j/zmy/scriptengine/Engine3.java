package com.prepare4j.zmy.scriptengine;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import java.math.BigDecimal;

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
public class Engine3 {
    public static void main(String args[]) {
        ScriptEngineManager manager = new ScriptEngineManager();
        // 建立javascript脚本引擎
        ScriptEngine engine = manager.getEngineByName("javascript");
        try {
            // 将变量name和变量值abcdefg传给javascript脚本

            engine.put("applyMoney",  50);
            engine.put("ratio",  0.6d);
            engine.put("maxMoney",  0);
            // 开始执行脚本

            engine.eval("output=applyMoney * ratio");
            // 得到output变量的值

            out.println("应报金额："+ engine.get("output"));
        } catch (ScriptException e) {
            err.println(e);
        }
    }
}