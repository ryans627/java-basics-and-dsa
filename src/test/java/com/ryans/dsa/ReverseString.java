package com.ryans.dsa;

public class ReverseString {
    // easiet way: use StringBuilder
    public static String reverseOne(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static String reverseTwo(String input) {
        char[] arr = input.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String input = "abcdefg";
        System.out.println(reverseOne(input));
        System.out.println(reverseTwo(input));
    }
}
