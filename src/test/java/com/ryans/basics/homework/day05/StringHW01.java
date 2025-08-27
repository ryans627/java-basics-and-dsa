package com.ryans.basics.homework.day05;

import java.util.Arrays;

public class StringHW01 {
    public static void main(String[] args) {
        String input = "Tom:20|Jack:22|Rose:24";
        // Step 1: split by "|" => ["Tom:20", "Jack:22", "Rose:24"]
        // Step 2: for each element in array:
        //      split by ":" => ["Tom", "20"]
        //      println("姓名: " + arr[0] + ", 年龄: " + arr[1])
        String[] persons = input.split("\\|"); // 两个反斜杠\\ => 转义字符，把具有语法意义的字符串转为普通符号
        System.out.println(Arrays.toString(persons)); // [Tom:20, Jack:22, Rose:24]
        for (String person : persons) {
            String[] info = person.split(":");
            System.out.println("姓名: " + info[0] + ", 年龄: " + info[1] + "岁");
        }
    }
}
