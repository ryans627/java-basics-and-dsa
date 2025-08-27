package com.ryans.basics.homework.day04.hw02;

/**
 * 作业2:
 * 创建一个Car类，
 * 有颜色、车轮、品牌属性，
 * 有启动、刹车功能
 */
public class Car {
    private String color;
    private String wheel;
    private String brand;

    public Car(String color, String wheel, String brand) {
        this.color = color;
        this.wheel = wheel;
        this.brand = brand;
    }

    public void start() {
        System.out.println("启动!");
    }

    public void brake() {
        System.out.println("刹车...");
    }
}
