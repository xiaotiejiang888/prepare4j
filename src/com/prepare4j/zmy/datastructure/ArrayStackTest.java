package com.prepare4j.zmy.datastructure;

import org.junit.Test;

public class ArrayStackTest {
    //测试自定义栈类 ArrayStack
//创建容量为3的栈，然后添加4个元素，3个int，1个String.
    @Test
    public void testArrayStack(){
        ArrayStack stack = new ArrayStack(3);
        stack.push(1);
        //System.out.println(stack.peek());
        stack.push(2);
        stack.push(3);
        stack.push("abc");
        System.out.println(stack.peek());
        System.out.println("==============");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("==============");
        System.out.println(stack.peek());
    }

    //进行字符串反转
    @Test
    public void testStringReversal(){
        ArrayStack stack = new ArrayStack();
        String str = "how are you";
        char[] cha = str.toCharArray();
        for(char c : cha){
            stack.push(c);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        System.out.println();
    }

    //分隔符匹配
//遇到左边分隔符了就push进栈，遇到右边分隔符了就pop出栈，看出栈的分隔符是否和这个有分隔符匹配
    @Test
    public void testMatch(){
        ArrayStack stack = new ArrayStack(3);
        String str = "12<a[b{c}]>";
        char[] cha = str.toCharArray();
        for(char c : cha){
            switch (c) {
                case '{':
                case '[':
                case '<':
                    stack.push(c);
                    break;
                case '}':
                case ']':
                case '>':
                    if(!stack.isEmpty()){
                        char ch = stack.pop().toString().toCharArray()[0];
                        if(c=='}' && ch != '{'
                                || c==']' && ch != '['
                                || c==')' && ch != '('){
                            System.out.println("Error:"+ch+"-"+c);
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
