package com.dl.study.m2.service;

import java.io.File;

public class Zxing {
    public static void main(String[] args) {
    CodeCreator create = new CodeCreator();
    CodeModel modelInfo = new CodeModel();
    modelInfo.setContents("http://www.baidu.com");
    //modelInfo.setDesc("资产编号"+459875);
    //modelInfo.setLogoFile(new File("D:/decode/fullgoalLoge.png"));
    create.createCodeImage(modelInfo, "D:/decode/dest."+modelInfo.getFormat());
  //  System.out.println("aaa");
    }
}