package com.example.helloword

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.helloword.lesson.thread.HandlerMainActivity
import com.example.helloword.utils.AppManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppManager.startActivity(this, HandlerMainActivity::class.java)
//        var intent = Intent(this@MainActivity, TestService::class.java)
//        findViewById<View>(R.id.tv).setOnClickListener {
//            startService(intent)
//        }
//        findViewById<View>(R.id.ts).setOnClickListener {
//            stopService(intent)
//        }
//        findViewById<View>(R.id.log).setOnClickListener {
//            Log.e("123", "123")
//        }
    }
}