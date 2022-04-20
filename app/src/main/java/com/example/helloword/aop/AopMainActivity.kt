package com.example.helloword.aop

import android.util.Log
import android.view.View
import com.example.helloword.R
import com.example.helloword.aop.annotation.ClickBehavior
import com.example.helloword.base.BaseActivity
import com.example.helloword.databinding.ActivityAopMainBinding
import com.example.helloword.utils.AppManager

/**
 * Created by K on 2022/4/19
 * function:
 * other:
 */
class AopMainActivity : BaseActivity<ActivityAopMainBinding>() {
    override fun setViewBinding(): ActivityAopMainBinding {
        return ActivityAopMainBinding.inflate(layoutInflater)
    }

    override fun initView() {
        AppManager.startActivity(this, LoginActivity::class.java)
        setViewClick(vBinding.tvTitle)
    }

    override fun initData() {
    }

    @ClickBehavior("我的")
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tv_title -> {
                Log.e("AopMainActivity","单击")
            }
        }
    }

}