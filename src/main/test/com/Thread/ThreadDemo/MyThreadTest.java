package com.Thread.ThreadDemo;

import com.Thread.ThreadDemo.MyThread;

public class MyThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
