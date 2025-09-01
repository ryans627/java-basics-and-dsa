package com.ryans.basics.lectures.day10.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertDemo {
    @Test
    public void test1() {
        Assert.assertEquals("登录成功", "登录成功");
        boolean assertFlag = false;
        Assert.assertTrue(assertFlag);
    }
}
