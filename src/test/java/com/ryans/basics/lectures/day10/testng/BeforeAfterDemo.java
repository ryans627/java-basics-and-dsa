package com.ryans.basics.lectures.day10.testng;

import org.testng.annotations.*;

public class BeforeAfterDemo {
    // 前置条件: 例如 取token 登录...
    // 高内聚 低耦合: 测试方法只做最小的测试
    // 比如写一个假如购物车单元测试，只写和购物车相关的业务
    // 将来如果登录发生了改变，购物车单元测试是不需要修改代码的.

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("before suite... 最大的前置");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("before test... 第二大前置");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class... 第三大前置");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod... 最小的前置");
    }

    @Test
    public void test1() {
        System.out.println("test1.....");
    }

    @Test
    public void test2() {
        System.out.println("test2.....");
    }
}
