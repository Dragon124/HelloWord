package com.example.helloword.lesson.thread;

import android.util.Log;


import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by K on 2022/4/26
 * function:
 * other:
 */
public class SynchronizedDemo {

    public static class SynchronizedDemo1 {
        private int number = 0;
        private AtomicInteger integer = new AtomicInteger(0);

        private void addNumber() {
            integer.getAndIncrement();
        }

        public void synchronize() {
            new Thread(() -> {
                for (int i = 0; i < 1_000_000; i++) {
                    addNumber();
                }
                Log.e("Thread-1", integer.get() + "");
            }).start();
            new Thread(() -> {
                for (int i = 0; i < 1_000_000; i++) {
                    addNumber();
                }
                Log.e("Thread-2", integer.get() + "");
            }).start();
        }
    }
}
