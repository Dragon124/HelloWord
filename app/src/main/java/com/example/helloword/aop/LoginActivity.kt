package com.example.helloword.aop

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.helloword.R
import com.example.helloword.aop.annotation.ClickBehavior

/**
 * Created by K on 2022/4/19
 * function:
 * other:
 */
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aop_main)
        findViewById<View>(R.id.tv_title).setOnClickListener {
            getData()
        }
    }

    @ClickBehavior("登录")
    public fun getData() {
        Log.e("123", "click")
    }

}