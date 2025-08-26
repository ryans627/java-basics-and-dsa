package com.ryans.dsa;

/**
 *  Write a Java program for this pattern:
 *  retest
 *  retes
 *  rete
 *  ret
 *  re
 *  r
 */
public class PrintPattern {
    public static void printPattern(String input) {
        // Corner case
        if (input == null || input.isEmpty()) {
            return;
        }
        char[] arr = input.toCharArray();

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String input = "retest";
        printPattern(input);
    }
}
