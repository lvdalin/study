package com.dl.study.m2.service;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import static javafx.scene.input.KeyCode.M;

/**
 * Created by mi on 2018/7/25.
 */
public class MakeUuid {
    public static void main(String[] args) {
       // System.out.println(UUID.randomUUID().toString());
      //  Long.toBinaryString(123232323);
      //  System.out.println(System.currentTimeMillis() < Math.pow(2,40));
       // System.out.println(Long.MAX_VALUE);
       // System.out.println(Integer.MAX_VALUE);Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017,01,01);
        long t1 = calendar.getTime().getTime();
        calendar.set(2117,01,01);
        long t2 = calendar.getTimeInMillis();
        System.out.println(t2-t1);
        System.out.println(t1);
        System.out.println(System.currentTimeMillis());
        /*  for (int i = 0; i < 9999; i++) {
            System.out.println(Math.floor(Math.random()*100) + 100 * i);
        }*/
    }
}
