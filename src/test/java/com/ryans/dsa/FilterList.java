package com.ryans.dsa;

import java.util.*;
import java.util.stream.Collectors;

public class FilterList {
    public static List<String> filterList(List<String> input) {
        List<String> result = new ArrayList<>();

        for (String name : input) {
            if (name.startsWith("J")) {
                result.add(name);
            }
        }
        return result; // [Jack, Jerry]
    }

    public static List<String> streamFilterList(List<String> input) {
        List<String> result = input.stream().filter(n -> n.startsWith("J")).collect(Collectors.toList());

        return result;
    }

    public static List<String> toUpperCase(List<String> input) {
        List<String> result = input.stream().map(String::toUpperCase).collect(Collectors.toList());
        return result;
    }

    public static long count(List<String> input) {
        long num = input.stream().filter(n -> n.length() > 3).count();
        return num;
    }

    public static long evenNumberSum(int[] nums) {
        long sum = Arrays.stream(nums).filter(n -> n % 2 == 0).sum();
        return sum;
    }

    public static List<String> filterMap(Map<String, Integer> input) {
        List<String> keys = input.entrySet().stream().filter(e -> e.getValue() > 20).map(Map.Entry::getKey).collect(Collectors.toList());
        return keys;
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Jack", "Rose", "Jerry");

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(nums);
        System.out.println(filterList(names));
        System.out.println(streamFilterList(names));
        System.out.println(toUpperCase(names));
        System.out.println(count(names));

        // int[] nums = {1, 3, 4, 5, 6, 8, 22, 33, 182, 8789821};
        // System.out.println(evenNumberSum(nums));
    }
}
