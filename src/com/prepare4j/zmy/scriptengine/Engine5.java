package com.prepare4j.zmy.scriptengine;

import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;
import com.greenpineyu.fel.context.FelContext;

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
public class Engine5 {
    public static void main(String args[]) {
        long a = System.currentTimeMillis();
        FelEngine fel = new FelEngineImpl();
        FelContext ctx = fel.getContext();
        ctx.set("out", System.out);
        ctx.set("os",  "02");
        ctx.set("brand",  "HONOR");
        ctx.set("model",  "LLD-AL20");
        ctx.set("version",  3.1d);
        ctx.set("grayTargetVersion",  5.0d);

        Object eval = fel.eval("(os=='02'&&brand=='HONOR'&&model=='LLD-AL20'&&version>3)?grayTargetVersion:version");
        out.println((System.currentTimeMillis() - a)+"毫秒");
        out.println(eval);
    }
}