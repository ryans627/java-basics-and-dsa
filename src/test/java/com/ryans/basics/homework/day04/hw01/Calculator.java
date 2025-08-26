package com.ryans.basics.homework.day04.hw01;

/**
 * 1.基于面向对象的思想写一个简单的计算器类Calculator，定义四个函数，实现两个int类型数据的加减乘除，通过创建对象，调用函数，完成两个整数3与4的加减乘除运算
 */
public class Calculator {
    public void add(int x, int y) {
        int res = x + y;
        System.out.println("The adding result is: " + res);
    }

    public void minus(int x, int y) {
        int res = x - y;
        System.out.println("The minus result is: " + res);
    }

    public void multiply(int x, int y) {
        int res = x * y;
        System.out.println("The multiple result is: " + res);
    }

    public void divide(int x, int y) {
        int res = x / y;
        System.out.println("The division result is: " + res);
    }

}
