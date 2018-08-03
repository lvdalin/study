package com.dl.study.m2.service;

public class ReferencePkValue2 {

    public static void main(String[] args) {
        ReferencePkValue2 t = new ReferencePkValue2();
        int a = 99;
        t.test1(a);//这里传递的参数a就是按值传递 
        System.out.println("main a : "+a);

        MyObj obj = new MyObj();
        t.test2(obj);//这里传递的参数obj 传递的是obj存储的地址 
        System.out.println("main t2: "+obj.b);

        t.test3(obj);//这里传递的参数obj 传递的是obj存储的地址
        System.out.println("main t3: "+obj.b);
    }

    public void test1(int a) {
        a = a++;
        System.out.println("test1 : "+a);
    }

    public void test2(MyObj obj) {
        obj = new MyObj();
        obj.b = 100;
        System.out.println("test2 : "+obj.b);
    }

    public void test3(MyObj obj) {
        obj.b = 100;
        System.out.println("test3 : "+obj.b);
    }
}

class MyObj {
    public int b = 99;
}