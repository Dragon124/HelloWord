package com.example.helloword.lesson.thread;

import android.util.Log;

import java.lang.reflect.Field;

/**
 * Created by K on 2022/4/25
 * function:
 * other:
 */
//通过反射查看当前线程threadLocals的值
class LookThreadLocalsValue {
    public void look() {
        try {
            Field f = Thread.currentThread().getClass().getDeclaredField("threadLocals");
            f.setAccessible(true);
            Log.e("123",f.get(Thread.currentThread()).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
