package com.example.helloword.aop.aspect;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by K on 2022/4/19
 * function:
 * other:
 */
@Aspect
//定义切面类
class ClickBehaviorAspect {
    private final static String TAG = "netease>>>";

//    @Pointcut("execution(@com.example.helloword.aop.annotation.ClickBehavior * *(..))")
//    public void methodPointcut() {
//        Log.e("123", "1");
//    }

    @Around("execution(* android.view.View.OnClickListener.onClick(..))")
    public Object jointPotion(ProceedingJoinPoint joinPoint) throws Throwable {
        Log.e("123", "单机");
        return joinPoint.proceed();
    }
}
