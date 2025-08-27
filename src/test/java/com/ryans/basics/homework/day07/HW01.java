package com.ryans.basics.homework.day07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 1.新建一个类，类名自取，main函数里创建一个ArrayList对象。使用今天上课讲得到的api完成下面的要求。
    * 往这个ArrayList对象里添加如下String类型的数据：“张三”，“李四”，“王五”，“张三”，”赵六”
    * 判断这个集合是否为空，并打印判断的结果。
    * 打印这个集合的大小。
    * 判断这个集合是否包含数据"王五"。
    * 将”张三”这条数据删掉。
    * 利用迭代器迭代获取list集合中的每个元素，并打印。
    * 将list转换成数组。并循环打印数组中的元素。
 */
public class HW01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("张三");
        list.add("赵六");
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.contains("王五"));

        list.remove("张三");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("===============");
        String[] arr = list.toArray(new String[0]);
        for (String name : arr) {
            System.out.println(name);
        }
    }
}
