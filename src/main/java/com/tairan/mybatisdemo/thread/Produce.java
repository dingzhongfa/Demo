package com.tairan.mybatisdemo.thread;

/**
 * Created by hzdzf on 2017/3/1.
 */
public class Produce {

    private String name;

    private long value;

    public Produce() {
    }

    public Produce(String name, long value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Produce{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
