package com.ryans.basics.homework.day03;

/**
 * 打印下面的数据（for循环嵌套实现）
 *
 * 1 2 3
 * 4 5 6
 * 7 8 9
 */
public class HW02Matrix {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
