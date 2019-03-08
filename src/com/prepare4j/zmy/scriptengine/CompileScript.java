package com.prepare4j.zmy.scriptengine;

import javax.script.*;
import java.io.*;

import static java.lang.System.*;

public class CompileScript {
    public static void main(String args[]) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("javascript");
        engine.put("counter", 0); // 向javascript传递一个参数
        // 判断这个脚本引擎是否支持编译功能

        if (engine instanceof Compilable) {
            Compilable compEngine = (Compilable) engine;
            try {
                // 进行编译

                CompiledScript script = compEngine.compile("function count() { " +
                        " counter = counter +1; " +
                        " return counter; " +
                        "}; count();");
                out.printf("Counter: %s%n", script.eval());
                out.printf("Counter: %s%n", script.eval());
                out.printf("Counter: %s%n", script.eval());
            } catch (ScriptException e) {
                err.println(e);
            }
        } else {
            err.println("这个脚本引擎不支持编译!");
        }
    }
}