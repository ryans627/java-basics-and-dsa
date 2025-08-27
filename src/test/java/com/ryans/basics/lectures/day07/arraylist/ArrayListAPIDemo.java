package com.ryans.basics.lectures.day07.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAPIDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        // 删除
        list.remove("a");
        System.out.println(list);
        // 修改
        list.set(0, "z");
        System.out.println(list);
        // 查询
        System.out.println(list.get(0));
        // 查询是否为空
        System.out.println(list.isEmpty());
        // 长度
        System.out.println(list.size());
    }
}
