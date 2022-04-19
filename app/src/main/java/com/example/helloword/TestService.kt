package com.example.helloword

import android.app.Service
import android.content.Intent
import android.os.Handler
import android.os.IBinder
import android.os.Message
import android.util.Log

/**
 * Created by K on 2022/3/24
 * function:
 * other:
 */
class TestService : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.e("123", "service start" + Thread.currentThread().name)
        var handler = MyHandler()
        Thread {
            handler.sendMessage(Message())
        }.start()
        Thread.sleep(300000)
        return super.onStartCommand(intent, flags, startId)
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.e("123", "service stop")
    }

    private class MyHandler : Handler() {
        override fun handleMessage(msg: Message) {
            super.handleMessage(msg)
            Log.e("123", "handler")
        }
    }
}