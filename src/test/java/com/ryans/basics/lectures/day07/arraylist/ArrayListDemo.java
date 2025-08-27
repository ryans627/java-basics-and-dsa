package com.ryans.basics.lectures.day07.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        // ArrayList: 超级数组，优势：长度可变
        // 集合类: Collection => 需要导包: Alt + Enter
        // 集合/容器最重要的方法：1. 存进去；2.取出来
        ArrayList list = new ArrayList();
        // 存进去
        list.add("1");
        list.add("2");
        list.add("4");
        list.add("3");
        // 没什么打印list没有输出地址值？
        // 原因：
        // 1. ArrayList类重写了toString()
        // 2. println会自动调用传入对象的toString()方法
        System.out.println(list);
        // 取出来
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println("===============");

        // 更优秀规范的写法: 支持Java的强类型特点 => 范型
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("4");
        list2.add("3");

        // 遍历arraylist
        // 方式1:普通for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("==============");
        // 方式2:增强for
        for (String s : list2) {
            System.out.println(s);
        }
        System.out.println("==============");

        // 方式3:迭代器（已经被增强for替代）
        Iterator<String> iterator = list2.iterator();
        // 如果迭代器中有下一个元素，就访问/移到下一个元素
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
