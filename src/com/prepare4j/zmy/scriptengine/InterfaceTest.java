package com.prepare4j.zmy.scriptengine;

import javax.script.*;

import static java.lang.System.*;

public class InterfaceTest {
    public static void main(String args[]) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("javascript");
        try {
            engine.eval("function run() {print(异步调用);}");
            Invocable invokeEngine = (Invocable) engine;
            Runnable runner = invokeEngine.getInterface(Runnable.class);
            Thread t = new Thread(runner);
            t.start();
            t.join();
        } catch (InterruptedException e) {
            err.println(e);
        } catch (ScriptException e) {
            System.err.println(e);
        }
    }
}