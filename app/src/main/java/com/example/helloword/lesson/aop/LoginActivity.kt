package com.example.helloword.lesson.aop

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.helloword.R
import com.example.helloword.lesson.aop.annotation.ClickBehavior

/**
 * Created by K on 2022/4/19
 * function:
 * other:
 */
class LoginActivity : AppCompatActivity() {
    val view: TextView by lazy { findViewById(R.id.tv_title) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aop_main)

        view.setOnClickListener {
            getData()
        }
        view.addOnAttachStateChangeListener(object : View.OnAttachStateChangeListener {
            override fun onViewAttachedToWindow(v: View?) {
                Log.e("123", "onViewAttachedToWindow")
            }

            override fun onViewDetachedFromWindow(v: View?) {
                Log.e("123", "onViewDetachedFromWindow")
            }

        })
        
    }

    @ClickBehavior("登录")
    public fun getData() {
        view.setText("1")
        var params = view.layoutParams
        params.width = 50
        view.layoutParams = params
        Log.e("123", "click")
    }

}