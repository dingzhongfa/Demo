package com.tairan.mybatisdemo.thread;

/**
 * Created by hzdzf on 2017/3/1.
 */
public class ProductThread implements Runnable {

    private Table table;

    private Produce produce;

    public ProductThread() {
    }

    public ProductThread(Table table,Produce produce) {
        this.table = table;
        this.produce = produce;
    }

    @Override
    public void run() {
        if (table.getList().size()==10){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            notifyAll();
        }
        table.add(produce);

    }
}
