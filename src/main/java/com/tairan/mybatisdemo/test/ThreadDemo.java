package com.tairan.mybatisdemo.test;

import java.util.concurrent.CountDownLatch;

/**
 * Created by hzdzf on 2017/2/28.
 */
public class ThreadDemo {

    public  int i;

    public void  add(){
        i++;
    }

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        ThreadDemo threadDemo = new ThreadDemo();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int n=0;n<5000;n++){
                    threadDemo.add();
                }
                countDownLatch.countDown();
            }
        },"线程一").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int n=0;n<5000;n++){
                    threadDemo.add();
                }
                countDownLatch.countDown();
            }
        },"线程二").start();
        countDownLatch.await();
        System.out.println(threadDemo.i);
    }


}
