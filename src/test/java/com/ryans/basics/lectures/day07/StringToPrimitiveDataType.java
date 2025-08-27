package com.ryans.basics.lectures.day07;

public class StringToPrimitiveDataType {
    public static void main(String[] args) {
        String str = "10086";
        int i = Integer.parseInt(str);
        System.out.println(i);

        String str2 = "100.35";
        System.out.println(str2.getClass());
        float f = Float.parseFloat(str2);
    }
}
