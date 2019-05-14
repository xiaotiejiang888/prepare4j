package com.prepare4j.zmy.prepare4gf.optional;

import java.util.Optional;

/**
 * Optional给了我们一个真正优雅的Java风格的方法来解决null安全问题。其中map方法输入参数是lambda表达式,自动封装每个函数的返回值
 * ,而且支持这种链式写法,代码看起来直接就变得舒服起来。Optional类其实是一个包装非空对象的容器类型。使用缺省值表示null值
 * ，意图为我们在java系统中减少空指针异常。
 */
public class NpeOptionalTest {
    public String testNpe(School school) {
        return Optional.ofNullable(school)
                .map(s->s.getGrade())
                .map(g->g.getStudent())
                .map(stu->stu.getName())
                .orElse("");
    }
}
