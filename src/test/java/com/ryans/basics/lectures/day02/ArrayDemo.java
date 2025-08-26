package com.ryans.basics.lectures.day02;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // 静态初始化: 一开始就赋值
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        // 动态初始化: 只初始化长度
        // 后续再赋值
        int[] arr2 = new int[3];
        arr2[0] = 3;
        arr2[1] = 4;
        arr2[2] = 5;
        System.out.println(Arrays.toString(arr2));

        // 数组：盛放数据的容器
        int age1 = 20;
        // 静态初始化 数据类型[] 数组的名字 = {值1, 值2, 值3};
        int[] ages = {20, 21, 22, 23, 32, 29};
        // 在Java中，地址值是没有用的
        // 因为Java是应用层语言，无法像C语言一样直接操作地址
        System.out.println(ages); // [I@6bc7c054
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);
        System.out.println(ages[5]);

        // 赋值
        System.out.println("============");
        ages[5] = 20;
        System.out.println(ages[5]);
    }
}
