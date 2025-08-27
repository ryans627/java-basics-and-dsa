package com.ryans.basics.homework.day04.hw02;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car("green", "米其林", "奔驰");
        car.start();
        car.brake();
        System.out.println(car);
        System.out.println();
    }
}
