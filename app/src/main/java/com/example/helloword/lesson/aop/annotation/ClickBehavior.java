package com.example.helloword.lesson.aop.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by K on 2022/4/19
 * function:
 * other:
 */
@Target(ElementType.METHOD)//作用在方法之上
@Retention(RetentionPolicy.RUNTIME)
public @interface ClickBehavior {
    String value();
}
