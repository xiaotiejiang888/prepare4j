package com.prepare4j.zmy.jzoffer.test1;

public class CodeBlock {
    {
        System.out.println("构造代码块");
    }

    public CodeBlock(){
        System.out.println("无参构造函数");
    }
    public CodeBlock(String str){
        System.out.println("有参构造函数");
    }

    public static void main(String[] args) {
        new CodeBlock();
        new CodeBlock("sss");
    }
}