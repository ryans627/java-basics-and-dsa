package com.ryans.basics.lectures.day11.parametrization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    // dataProvider写方法名
    @Test(dataProvider = "data1")
    public void test1(String username, String password) {
        System.out.println("username: " + username + ", password: " + password);
    }

    // dataProvider写方法名
    @Test(dataProvider = "data1")
    public void test2(String username, String password, String sex) {
        System.out.println("username: " + username + ", password: " + password + ", sex: " + sex);
    }

    // 数据的提供者
    // 返回二维数组 Object[][]: 多组数据
    @DataProvider
    public Object[][] data1() {
        Object[][] data = {
                {"zhangsan", ""},
                {"", "123"},
                {"zhangsan", "123456"}
        };
        return data;
    }
}
