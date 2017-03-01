package com.tairan.mybatisdemo.thread;

import java.util.List;

/**
 * Created by hzdzf on 2017/3/1.
 */
public class Table {

    private List<Produce> list;

    public void add(Produce produce){
        System.out.println(Thread.currentThread().getName()+"生产了"+produce.getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list.add(produce);
    }

    public void consume(){
        System.out.println(Thread.currentThread().getName()+"消费了"+list.get(list.size()-1).getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list.remove(list.size()-1);
    }

    public List<Produce> getList() {
        return list;
    }

    public void setList(List<Produce> list) {
        this.list = list;
    }
}
