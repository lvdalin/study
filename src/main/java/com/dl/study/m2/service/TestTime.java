package com.dl.study.m2.service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class TestTime {
    public static void main(String[] args) {
        System.out.println(Instant.now().getEpochSecond());
        String pattern = "%04d";
      //  for (Long i = 0L; i < 10; i++) {
        //    System.out.println(String.format(pattern,i));

      //  }
        String s = "123456";
        System.out.println(s.substring(s.length()-4));
        System.out.println(Long.MAX_VALUE);
       List<String> strings = generateQrCode(30);
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
    private static List<String> generateQrCode(Integer count ){
        List<String> qrCodeList = new ArrayList<String>(count);
        long createSecond = Instant.now().getEpochSecond();//10位
     ///   String userNo = String.format(STR_PARTEN_4,user.getUserNo());//四位NO
        String prefix = createSecond + "3356";
        for (int i = 0; i < count; i++) {
            String code = prefix+String.format("%04d",i);
            qrCodeList.add(Long.toHexString(Long.parseLong(code)).toUpperCase());
        }
        return qrCodeList;
    }
}

