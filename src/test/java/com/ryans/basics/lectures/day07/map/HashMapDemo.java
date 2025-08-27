package com.ryans.basics.lectures.day07.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        // 添加/更新
        map.put(100, "李四");
        map.put(101, "张三");
        map.put(200, "王五");
        map.put(200, "王五2");
        System.out.println(map);
        // 查询取值: 通过键找值
        System.out.println(map.get(200));
        System.out.println("=======");
        // 删除
        map.remove(101);
        System.out.println(map);
        // 获取map的集合大小: size()
        System.out.println(map.size());
        System.out.println(map.containsKey(101)); // false
    }
}
