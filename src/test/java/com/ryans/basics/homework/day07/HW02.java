package com.ryans.basics.homework.day07;

import java.util.HashMap;
import java.util.Map;

/**
 * 2.新建一个类，类名自取，main函数里创建一个HashMap对象。完成下面的要求。
 *
 * 往这个HashMap对象里添加自己的姓名和年龄，键值分别为”name”和”age”。
 * 判断这个集合是否为空，并打印判断的结果。
 * 打印这个集合的大小。
 * 判断这个集合是否包含数据“王五”，并打印判断结果。
 * 将map里的age删掉。
 * 获取map的所有键，并打印。
 * 获取map的所有值，并打印。
 * 用两种方法获取map里所有的键值对，并打印。
 */
public class HW02 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ryan", 30);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey("王五"));
        map.remove("Ryan");
        map.put("Nicole", 31);
        map.put("Abbey", 20);
        map.put("Tom", 18);
        map.put("Nicholas", 20);
        System.out.println(map);
        System.out.println("==========");
        for (String name : map.keySet()) {
            System.out.println(name);
        }
        for (Integer age : map.values()) {
            System.out.println(age);
        }
        // 遍历键值对方式1:
        for (String name : map.keySet()) {
            System.out.println(name + ": " + map.get(name));
        }
        System.out.println("========");
        // 遍历键值对方式2:
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("==========");
        // 遍历键值对方式3:
        map.forEach((k,v) -> {
            System.out.println(k + ": " + v);
        });
    }
}
