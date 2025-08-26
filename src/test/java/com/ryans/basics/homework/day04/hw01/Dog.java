package com.ryans.basics.homework.day04.hw01;

public class Dog extends Animal {
    @Override
    public void sleep() {
        System.out.println("我是小狗，我睡觉与众不同");
    }

    public void watch() {
        System.out.println("我的专业是看家");
    }
}
