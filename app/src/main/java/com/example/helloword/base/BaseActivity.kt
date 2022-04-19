package com.example.helloword.base

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

/**
 * Created by K on 2022/4/19
 * function:
 * other:
 */
abstract class BaseActivity<T : ViewBinding> : AppCompatActivity(), View.OnClickListener {
    val vBinding by lazy {
        setViewBinding()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(vBinding.root)
        initView()
        initData()
    }

    fun setViewClick(view: View) {
        view.setOnClickListener(this)
    }

    abstract fun setViewBinding(): T

    abstract fun initView()

    abstract fun initData()
}