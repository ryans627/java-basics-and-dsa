package com.ryans.basics.homework.day10.testng;

import org.testng.annotations.*;

public class LoginTest {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("全局初始化操作1");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("登录测试类执行开始");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("登录测试方法执行开始");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("登录测试方法执行结束");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("登录测试类执行结束");
    }

    @Test
    public void loginSuccess() {
        System.out.println("测试登录成功！");
    }
}
