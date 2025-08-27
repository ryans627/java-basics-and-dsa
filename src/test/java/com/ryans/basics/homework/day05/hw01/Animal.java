package com.ryans.basics.homework.day05.hw01;

/**
 * 1、写一个动物类，有吃饭和睡觉的方法， 要求：
 *
 * a、写一个猫类继承动物类，还有特有的抓老鼠方法，并且重写吃饭方法
 *
 * b、写一个狗类继承动物类，还有特有的看家方法，并且重写睡觉方法
 */
public class Animal {
    public void eat() {
        System.out.println("我在吃饭");
    }

    public void sleep() {
        System.out.println("我在睡觉");
    }
}
