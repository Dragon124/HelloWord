package com.example.helloword.lesson.generics.bean;

/**
 * Created by K on 2022/5/24
 * function:
 * other:
 */
public class Fruit<T> {
    public T data;
    public String describe ;

    @Override
    public String toString() {
        return "Fruit{" +
                "data=" + data.toString() +
                ", describe='" + describe + '\'' +
                '}';
    }
}
