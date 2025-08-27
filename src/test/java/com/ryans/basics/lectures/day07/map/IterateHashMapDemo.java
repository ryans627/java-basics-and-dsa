package com.ryans.basics.lectures.day07.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IterateHashMapDemo {
    public static void main(String[] args) {
        // 实例化一个HashMap
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "李四");
        map.put(101, "张三");
        map.put(200, "王五");

        // 遍历HashMap
        // 方式1: get + keys => 先找到所有的keys, 再通过key找value
        // map.keySet()返回的是一个Set, set里面全部都是keys
        Set<Integer> ids = map.keySet();
        for (Integer id : ids) {
            System.out.println(map.get(id));
        }

        // 方式2: entrySet() => 拿到键值对
        // 直接遍历键值对
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("===================");

        // 方式3: Lambda表达式 (JDK 1.8+) => 简化语法
        map.forEach((k, v) -> {
            System.out.println(k + "=" + v);
        });
    }
}
