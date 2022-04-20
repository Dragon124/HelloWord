package com.example.helloword.aop.aspect;

import android.util.Log;
import com.example.helloword.aop.annotation.ClickBehavior;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
/**
 * Created by K on 2022/4/19
 * function:
 * other:
 */
//定义切面类
@Aspect
public class ClickBehaviorAspect {
    //execution已方法执行时作为切入点
    //* *(..)) 处理ClickBehavior这个类所有方法
    @Pointcut("execution(@com.example.helloword.aop.annotation.ClickBehavior * *(..))")
    public void methodPointcut() {

    }

    //对切入点如何处理
    @Around("methodPointcut()")
    public Object jointPotion(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Log.e("类名",signature.getDeclaringType().getSimpleName());
        Log.e("类名+包名",signature.getDeclaringType().getName());
        Log.e("方法名",signature.getName());
        Log.e("注解值",signature.getMethod().getAnnotation(ClickBehavior.class).value()+"");
        return joinPoint.proceed();
    }
}
