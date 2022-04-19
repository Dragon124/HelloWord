package com.example.helloword

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.helloword.aop.AopActivity
import com.example.helloword.utils.AppManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppManager.startActivity(this, AopActivity::class.java)
        var intent = Intent(this@MainActivity, TestService::class.java)
        findViewById<View>(R.id.tv).setOnClickListener {
            startService(intent)
        }
        findViewById<View>(R.id.ts).setOnClickListener {
            stopService(intent)
        }
        findViewById<View>(R.id.log).setOnClickListener {
            Log.e("123", "123")
        }
    }
}