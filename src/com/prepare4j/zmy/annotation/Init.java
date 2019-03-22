package com.prepare4j.zmy.annotation;

import java.lang.annotation.*;

@Documented  //注解包含在javadoc中
@Inherited //注解可以被继承
@Target({ElementType.FIELD,ElementType.METHOD})//注解的作用目标
@Retention(RetentionPolicy.RUNTIME)//注解的保留策略
public @interface Init {
    public String value() default "";
}
