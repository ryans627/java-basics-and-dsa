package com.ryans.basics.lectures.day07.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        // Set的特点：无序无索引，不可重复
        Set<String> set = new HashSet<>();
        set.add("xxxx");
        set.add("xxxx");
        set.add("xxxx");
        set.add("xxxx");
        set.add("123132141");
        set.add("sadsda");
        set.add("这");
        System.out.println(set);
        System.out.println(set.contains("asda"));
        System.out.println("=============");

        // 遍历set
        for (String s : set) {
            System.out.println(s);
        }

        // set的迭代器循环
        // Iterator是一个接口：遵循同一个规则，必须要实现hasNext()和next()方法
        // 迭代器接口的作用，规范方法：
        // 1. 判断是否有下一个元素 => boolean；
        // 2. 获取下一个元素 => 元素
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}