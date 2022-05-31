package com.atguigu.java;

/**
 * @author shkstart
 * @create 2020-09-01 22:31
 */
public class IntegerTest {
    public static void main(String[] args) {

        Integer x = 5;
        int y = 5;
        System.out.println(x == y);

        Integer i1 = 10;
        Integer i2 = 10;
        System.out.println(i1 == i2);//true

        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);//false

        Integer i5 = new Integer(1);
        Integer i6 = 1;
        System.out.println(i5 == i6);//false

        Integer i7 = new Integer(10);
        int i8 = 10;
        System.out.println(i7 == i8);//true

    }
}
