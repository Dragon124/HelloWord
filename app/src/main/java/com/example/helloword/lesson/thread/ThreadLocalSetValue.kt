package com.example.helloword.lesson.thread

import android.util.Log

/**
 * Created by K on 2022/4/25
 * function:
 * other:
 */
class ThreadLocalSetValue {
    fun setValue() {
        var threadLocal = ThreadLocal<String>()
        Log.e("123", threadLocal.get() + "")
        threadLocal.set("ye")
        threadLocal.get()
        Log.e("123", threadLocal.get() + "")
        Thread(){
            kotlin.run {
                Log.e("123", threadLocal.get() + "")
            }
        }
        LookThreadLocalsValue().look()
    }
}