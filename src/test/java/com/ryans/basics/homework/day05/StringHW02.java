package com.ryans.basics.homework.day05;

public class StringHW02 {
    public static String reverse(String input) {
        char[] arr = input.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            swap(arr, left, right);
            left++;
            right--;
        }
        return new String(arr);
    }

    public static String builtInReverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        String input = "abcdefg";
        System.out.println(reverse(input));
        System.out.println(builtInReverse(input));
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
