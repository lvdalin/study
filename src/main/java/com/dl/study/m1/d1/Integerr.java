package com.dl.study.m1.d1;

/**
 * Created by mi on 2018/7/25.
 */
public final class Integerr extends Number implements Comparable<Integerr>{

    public final int value;

    public Integerr(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Integerr o) {
        return 0;
    }
    public static Integerr valueOf(int i) {
        return new Integerr(i);
    }
    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}
