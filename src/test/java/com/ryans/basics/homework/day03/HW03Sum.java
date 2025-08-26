package com.ryans.basics.homework.day03;
// 作业3:写一段程序分别求出0到100之间所有的偶数的和以及奇数的和
public class HW03Sum {
    public static void main(String[] args) {
        int even_sum = 0;
        int odd_sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                even_sum += i;
            } else {
                odd_sum += i;
            }
        }
        System.out.println("偶数之和为: " + even_sum);
        System.out.println("奇数之和为: " + odd_sum);
    }
}
