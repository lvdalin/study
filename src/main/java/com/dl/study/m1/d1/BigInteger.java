package com.dl.study.m1.d1;

import java.util.Scanner;

/**
 * Created by mi on 2018/5/3.
 */
public class BigInteger {
    /**
     * 大数相乘基本思想，输入字符串，转成char数组，转成int数组。采用分治思想，每一位的相乘;<br>
     * 公式：AB*CD = AC (BC+AD) BD , 然后从后到前满十进位(BD,(BC+AD),AC)。
     * 关键点：下标和相等的 处于同一数量级【个位级，十位级，百位级。。。】。
     * @param num1
     * @param num2
     */
    public String multiply(String num1 ,String num2){
        char[] c1 = num1.toCharArray();
        char[] c2 = num2.toCharArray();

        int[] result = new int[c1.length+c2.length-1];
        int[] n1 = new int[c1.length];
        int[] n2 = new int[c2.length];

        for (int i=0;i<c1.length;i++){
            n1[i] = c1[i] - '0';
        }
        for (int i=0;i<c2.length;i++){
            n2[i] = c2[i] - '0';
        }

        for(int i = 0;i<n1.length;i++){
            for(int j=0;j<n2.length;j++){
                result[i+j] += n1[i] * n2[j];
            }
        }
        for(int i=result.length-1;i>0;i--){
            result[i-1] += result[i]/10;
            result[i] = result[i]%10;
        }
        //输出
        StringBuilder builder = new StringBuilder(result.length);
        for(int i=0 ;i<result.length;i++){
            builder.append(String.valueOf(result[i]));
        }
        return builder.toString();
    }
    public static void main(String[] args) {
        BigInteger bm = new BigInteger();
        System.out.println("-----输入两个大数------");
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.next();
        String num2 = scanner.next();
        String result = bm.multiply(num1, num2);
        System.out.println("相乘结果为："+result);
        scanner.close();
    }
}
