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
public class Engine4 {
    public static void main(String args[]) {
        long a = System.currentTimeMillis();
        ScriptEngineManager manager = new ScriptEngineManager();
        // 建立javascript脚本引擎
        ScriptEngine engine = manager.getEngineByName("javascript");
        try {
            // 将变量name和变量值abcdefg传给javascript脚本

            engine.put("os",  "02");
            engine.put("brand",  "HONOR");
            engine.put("model",  "LLD-AL20");
            engine.put("version",  "3.1");
            engine.put("grayTargetVersion",  "5.0");
            String money = "";
            // 开始执行脚本

//            for (int i=0;i<100;i++){
                engine.eval("output=(os=='02'&&brand=='HONOR'&&model=='LLD-AL20'&&version>3)?grayTargetVersion:version");
                money = engine.get("output").toString();
                out.println("获得输出："+ money);
//            }
            out.println((System.currentTimeMillis() - a)+"毫秒");
        } catch (ScriptException e) {
            err.println(e);
        }
    }
}