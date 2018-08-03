package com.dl.study.m1.d1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mi on 2018/7/18.
 */
public class TestHashMap {
    public static void main(String[] args){
        Map m = new HashMap(2);
        m.put(1,2323);
        m.put(2,323);
       /* Map m = new HashMap(64);
       for(int i=0;i<64;i++){
            Object p = m.put(i, String.valueOf(i));
        }
        Object p = m.put(17, 17);
        Object put1 = m.put(null, "122");
        System.out.println(put1);
        Object put2 = m.put(null, "443");
        System.out.println(put2);*/
       /* for (int i = 0 ;i < 50;i++){
            int h = ((Object)i).hashCode();
           // System.out.print("hash code = "+ h);
            //System.out.print(" 三异或 = "+ (h^h^h));
            //System.out.println(" 异或0 ="+ (0 ^ h));
            System.out.println(" = "+ Integer.toBinaryString(shash(i)));
        }*/

    }
}
