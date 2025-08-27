package com.ryans.dsa;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */
public class TwoSum {
    // 需要return int[] => 位置不能换
    // O(1)的时间查到target - num1是否在map中
    // map: <num, index>
    // Time = O(N), Space = O(N)
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[] {-1, -1};
        // Corner case
        if (nums == null || nums.length < 2) {
            return result;
        }

        // 存的是num2的值和num1的index
        Map<Integer, Integer> num2Index = new HashMap<>();
        // iterate the input array
        for (int i = 0; i < nums.length; i++) {
            // 如果当前这个数字不存在 => 就把target - 当前数字存起来
            if (!num2Index.containsKey(nums[i])) {
                num2Index.put(target - nums[i], i);
                continue;
            }
            // 如果当前这个数字存在 => 说明
            result[0] = i;
            result[1] = num2Index.get(nums[i]);
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
