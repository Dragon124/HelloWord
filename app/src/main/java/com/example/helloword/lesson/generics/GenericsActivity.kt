package com.example.helloword.lesson.generics

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.helloword.lesson.generics.bean.*
import com.google.gson.Gson
import java.lang.reflect.ParameterizedType

/**
 * Created by K on 2022/5/24
 * function:
 * other:
 */
class GenericsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Test().showType()
        var gson = Gson()
        var fruitString = gson.toJson(getData())
        string2Bean(fruitString, gson)
    }

    private fun getData(): Fruit<Apple> {
        var apple = Apple()
        apple.name = "苹果"
        var bean = Fruit<Apple>()
        bean.describe = "这是水果"
        bean.data = apple
        return bean
    }

    private fun string2Bean(gsonStrng: String, gson: Gson) {
        Log.e("123", gsonStrng)
        var type = object : Fruit<Apple>() {}.javaClass.genericSuperclass as ParameterizedType
        var bean = gson.fromJson(gsonStrng,type.rawType as Class<*> )
//        var bean = gson.fromJson(gsonStrng, object : Fruit() {}.javaClass.genericSuperclass as Class<*>)
        Log.e("123", bean.toString())
    }
}