package com.ryans.basics.lectures.day07;

// 导入util包下所有的类
import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        HashMap<Integer, String> map = new HashMap<>();

        // 多态创建集合，约定俗成 => 多态的扩展性更好
        List<String> list2 = new ArrayList<>();
        Set<String> set2 = new HashSet<>();
        Map<Integer, String> map2 = new HashMap<>();
    }
}
