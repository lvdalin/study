package com.dl.study.m1.d1;

import java.lang.reflect.Field;

/**
 * 前提条件：
 * 1.参数的传递方式：值传递和引用传递，其中值传递为基础数据类型，引用传递为 对象，数组，集合等
 * 2.注意，这里要特殊考虑String，以及Integer、Double等几个基本类型包装类，它们都是immutable类型，
 因为没有提供自身修改的函数，每次操作都是新生成一个对象，所以要特殊对待，可以认为是和基本数据类型相似，传值操作
 *
 * 因此，正常情况下，是值传递了，就没办法完本体的数值交换操作了。
 * 但这并不是一个真正的值传递，又给了这个交换提供了可能。
 * 那什么方法能把可能变成现实呢？
 * 反射，反射可以获取到私有方法，可以修改其访问权限，可以完成对其值得修改。
 * 当这也会有其他问题。先看下代码
 */

public class ExchangeInteger {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 8;
   //     Integer c = 132;
   //     Integer d = 10;
       // swap0(a,b);
       // swap1(a,b);
        swap2(a,b);
        System.out.println("a="+a);
        System.out.println("b="+b);

        Integer m = Integer.valueOf(10);
        Integer n = 8;

        System.out.println("m="+m);
        System.out.println("n="+n);
    }
    public static void swap0(Integer c1,Integer c2){
        Integer tmp = c1;
        c1 = c2;
        c2 = tmp;
        //这个方法肯定不行，整体交换就像值传递一样，这里的c1,c2 是 传递过来的 a,b的副本，c1和a指向同一块内存（Integer:10）,
        //c2和 b 指向同一块内存（Integer:8）, c1 和 c2 做交换了，只是c1里指向变成了c2的，c2指向了c1。这并不影响a和b的指向
    }
    public static void swap1(Integer c1,Integer c2){
       // int tmp = c1.value;
      //  c1.value = c2.value;
      //  c2.value = tmp;
        // 从源码中得知 Integer 的值是由它的一个value属性决定。改变了value，那么这个对象就真实的发生变化了。
        // 这就不是引用的的交换，是其指向的内存中的值变了。所以这会影响到 a和b的改变。
        // 这种交换，是交换的 c1指向的内存中数据的改变，所以值真实的发生变化，
        // 但从注释就能看出，这根本就不能实现，因为value的private final类型的，对外不可见，不可修改
        // 那么 怎么办呢？如何获取私有的属性？
    }
    public static void swap2(Integer a,Integer b){
        try {
           // Integer c = a;
          //  Integer c = Integer.valueOf(a);
            Integer c = new Integer(a);
            // 通过反射获取私有属性，注意：getField和getDeclaredField的区别
            Class<? extends Integer> clazz = Integer.class;
            Field val = clazz.getDeclaredField("value");
            val.setAccessible(true);
            val.set(a,b);
            val.set(b,c);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
/**
 * main方法声明两个变量a、b，然后swap(a,b)完成交换，然后输出。
 * 若仔细看会发现一个问题，就是swap方法完成的是，
 */

/**
 * 参考资料：值传递和引用传递 https://www.cnblogs.com/binyue/p/3862276.html
 * 字节码指令：https://www.cnblogs.com/luyanliang/p/5498584.html
 */
