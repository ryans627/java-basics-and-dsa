package com.ryans.dsa;

import java.util.*;

public class FindDuplicates {
    public static List<Object> findDup(Object[] array) {
        // Corner case
        if (array == null || array.length < 2) {
            return new ArrayList<>();
        }
        Set<Object> seen = new HashSet<>();
        Set<Object> dups = new HashSet<>();

        for (Object obj : array) {
            if (seen.contains(obj)) {
                dups.add(obj);
            } else {
                seen.add(obj);
            }
        }

        return new ArrayList<>(dups);
    }

    public static void main(String[] args) {
        Object[] array = new Object[] {"123", "2", 1, 1.3, 5, 1, 2, "9", "right", "right", 3.33333, 1.3, 1.3, 1.3, 9, "9", "9"};
        System.out.println(findDup(array));
    }
}
