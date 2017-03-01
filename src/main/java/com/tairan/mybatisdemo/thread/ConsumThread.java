package com.tairan.mybatisdemo.thread;

/**
 * Created by hzdzf on 2017/3/1.
 */
public class ConsumThread implements Runnable {

    private Table table;

    public ConsumThread() {
    }

    public ConsumThread(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        if (table.getList().size()==0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            notifyAll();
        }
        table.consume();
    }
}
