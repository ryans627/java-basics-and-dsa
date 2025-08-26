package com.ryans.basics.homework.day03;

/**
 打印如下三角形（for循环嵌套实现）
 *
 * *
 * * *
 * * * *
 * * * * *
 */
public class HW01Triangle {
    public static void main(String[] args) {
        // 1-6行
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
