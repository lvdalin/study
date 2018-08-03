package com.dl.study.m1.d1;

public class ReferenceDome {
    private int i = 0;

    public static void main(String[] args) {
        ReferenceDome dome = new ReferenceDome();
      //  System.out.println("init=" + dome.i);
        changeReference(dome);
        System.out.println("change i=" + dome.i);
      //  changeInteger(dome);
      //  System.out.println("integer i = " + dome.i);
    }

    public static void changeReference(ReferenceDome w) {
        w = new ReferenceDome();
        w.i = 10;
    }

    public static void changeInteger(ReferenceDome w) {
        w.i = 10;
    }

}