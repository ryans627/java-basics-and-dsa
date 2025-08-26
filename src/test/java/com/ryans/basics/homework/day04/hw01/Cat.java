package com.ryans.basics.homework.day04.hw01;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("我是小猫，我喜欢吃饭");
    }

    public void catchMouse() {
        System.out.println("我喜欢抓老鼠");
    }
}
