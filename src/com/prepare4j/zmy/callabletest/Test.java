package com.prepare4j.zmy.callabletest;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        String[] strs = {"strs[0]"};
        String str = "str";
        t.xg(strs, str);
        System.out.println(strs[0]+"\t"+str);
    }

    /**
     * 你把你的这个方法改成这样你发现连数组都改不了。本来在主函数调用的时候传进来的str是“str”，
     * 他这个时候是“str”的地址，和主函数是同一个对象，你在这个函数里选择了重新创建对象，
     * 再把创建的对象赋值给你这个函数里的str这个引用，但是这个时候问题就来了，
     * 你函数里的str和主函数的str这个时候不是同一个对象了。在主函数里的那个对象在内存里一点都没变化，
     * 你所做的只不过是把原本是他的引用给了你自己创建的那个对象了。而传入的String本来是毫发无损，所以主函数打印出来还是原来的值。
     * 再回到你的数组上，你是改变数组的内容，而不是去创建新数组，你改变的数组和传入的数组是同一个对象，肯定也就改变了主函数里的数组了。当然如果说你只是改变传入的String的属性的话也是可以改变主函数的里的String的,不过string是个常量你改不了什么东西。
     * @param strs
     * @param str
     */
    public void xg(String[] strs,String str) {
//        strs[0] = "修改后的strs[0]";
        strs = new String[]{"修改后的strs[0]"};
        str = "修改后的str";
    }
}
