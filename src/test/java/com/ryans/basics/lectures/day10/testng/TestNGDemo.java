package com.ryans.basics.lectures.day10.testng;

import org.testng.annotations.Test;

public class TestNGDemo {
    // 不需要再写main方法，因为testng框架有自己的程序入口

    // @Test标识 => 当前
    @Test
    public void test1() {
        System.out.println("testng...");
    }

    @Test(enabled = false)
    public void test2() {
        System.out.println("testng 2...");
    }

    @Test(priority = 3)
    public void test3() {
        System.out.println("testng 3...");
    }

    @Test(priority = 2)
    public void test4() {
        System.out.println("testng 4...");
    }

    @Test(priority = 1)
    public void test5() {
        System.out.println("testng 5...");
    }

    @Test(invocationCount = 3)
    public void test6() {
        System.out.println("xxxxxxxx");
    }

    @Test(singleThreaded = true)
    public void test7() {
        System.out.println("77777777");
    }

    @Test(dependsOnMethods = "testLogin")
    public void testOrder() {
        System.out.println("订单测试...");
    }

    @Test
    public void testLogin() {
        System.out.println("登录测试...");
    }

    @Test(invocationCount = 100, threadPoolSize = 3)
    public void testMultiple() {
        System.out.println(Thread.currentThread().getName() + "......");
    }
}
