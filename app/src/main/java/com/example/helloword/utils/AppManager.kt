package com.example.helloword.utils

import android.app.Activity
import android.content.Context
import android.content.Intent

/**
 * Created by K on 2022/4/19
 * function:
 * other:
 */
class AppManager {
    companion object {
        public fun startActivity(context: Context, mClass: Class<out Activity>) {
            context.startActivity(Intent(context, mClass))
        }
    }
}