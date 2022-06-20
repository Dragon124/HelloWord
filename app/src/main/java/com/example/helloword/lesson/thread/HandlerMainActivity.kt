package com.example.helloword.lesson.thread

import android.os.*
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by K on 2022/4/25
 * function:
 * other:
 */
class HandlerMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        ThreadLocalSetValue().setValue()
        onStartThread()
//        SynchronizedDemo.SynchronizedDemo1().synchronize()
    }

    private fun onStartThread() {
        Log.e("1", Thread.currentThread().name)
        var thread = Thread {
            kotlin.run {
                Log.e("2", Thread.currentThread().name)
                Looper.prepare()
                var handler = Handler(Looper.myLooper()!!) {
                    //Thread-2
                    Log.e("3", Thread.currentThread().name)
                    true
                }
                var message = Message.obtain(handler) {
                    //Thread-2
                    Log.e("4", Thread.currentThread().name)
                    //结束循环,不然Looper.loop()方法之后的代码不会执行
                    Looper.myLooper()?.quit()
                }
                handler.sendMessage(message)
                //开始循环
                Looper.loop()
                Log.e("123","hhhhh");
            }
        }
        thread.start()
        HandlerThread("-").start()
    }
}
