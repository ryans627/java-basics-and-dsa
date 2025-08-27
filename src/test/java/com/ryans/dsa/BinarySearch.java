package com.ryans.dsa;

public class BinarySearch {
    public static int binarySearch(int[] nums, int target) {
        // Corner case
        if (nums == null || nums.length < 1) {
            return -1;
        }
        int left = 0, right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        // post processing
        if (nums[left] == target) {
            return left;
        }
        if (nums[right] == target) {
            return right;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 8, 9, 10, 12};
        System.out.println(binarySearch(nums, 1));
        System.out.println(binarySearch(nums, 3));
        System.out.println(binarySearch(nums, 5));
        System.out.println(binarySearch(nums, 6));
        System.out.println(binarySearch(nums, 10));
        System.out.println(binarySearch(nums, 12));
    }
}
