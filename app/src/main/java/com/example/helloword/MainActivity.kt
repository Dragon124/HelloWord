package com.example.helloword

import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.helloword.lesson.aop.AopMainActivity
import com.example.helloword.lesson.generics.GenericsActivity
import com.example.helloword.lesson.thread.HandlerMainActivity
import com.example.helloword.utils.AppManager
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppManager.startActivity(this, GenericsActivity::class.java)
//        var intent = Intent(this@MainActivity, TestService::class.java)
        findViewById<View>(R.id.tv).setOnClickListener {
//            startService(intent)
            var b = window.attributes as WindowManager.LayoutParams
            b.width = 100
            b.height = 10
            window.attributes = b

        }

        //
//        findViewById<View>(R.id.ts).setOnClickListener {
//            stopService(intent)
//        }
//        findViewById<View>(R.id.log).setOnClickListener {
//            Log.e("123", "123")
//        }
        //
    }
}