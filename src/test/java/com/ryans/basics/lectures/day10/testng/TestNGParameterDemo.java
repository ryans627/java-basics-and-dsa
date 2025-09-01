package com.ryans.basics.lectures.day10.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterDemo {

    @Test
    // 注解中一个属性给多个值 => 用 {} 数组的形式进行赋值
    @Parameters({"username1","password1"})
    public void testLogin(String username, String password) {
        System.out.println("Username is: " + username + ", password is: " + password);
    }
}
