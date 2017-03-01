package com.tairan.mybatisdemo.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by hzdzf on 2017/2/20.
 */
public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add(2,"2");
//        list.add(1,"1");
        list.add(0,"0");
        System.out.println(list.size());

        Integer i1 =127;
        Integer i2 =127;
        System.out.println(i1==i2);
        int i3 =227;
        int i4 =227;
        System.out.println(i3==i4);
        String aa = "ujehfiwufhiwhirusejikhrfskjhgksdrfughjiksdrgh";
        String bb = "ujehfiwufhiwhirusejikhrfskjhgksdrfughjiksdrgh";
        System.out.println(aa==bb);
    }
}
