package com.ryans.basics.lectures.day11.parametrization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DataProviderOptimizationDemo {
    // // dataProvider写方法名
    // @Test(dataProvider = "data1")
    // public void test2(String username) {
    //     System.out.println("username: " + username);
    // }
    //
    // // 数据的提供者
    // // 当只有一个数据的时候，一维数组是可以的
    // @DataProvider
    // public Object[] data1() {
    //     Object[] data = {"zhangsan", "lisi", "wangwu"};
    //     return data;
    // }

    @Test(dataProvider = "data1")
    public void testLogin(CaseInfo caseInfo) {
        System.out.println(caseInfo.getUsername() + ", " + caseInfo.getPassword() + ", " + caseInfo.getSex());
    }

    @DataProvider
    public Object[] data1() {
        CaseInfo caseInfo1 = new CaseInfo("zhangsan", "123456", "nan");
        CaseInfo caseInfo2 = new CaseInfo("zhangsan", "", "nan");
        CaseInfo caseInfo3 = new CaseInfo("", "123456", "nan");
        CaseInfo caseInfo4 = new CaseInfo("", "", "nan");

        List<CaseInfo> list = new ArrayList<>();
        list.add(caseInfo1);
        list.add(caseInfo2);
        list.add(caseInfo3);
        list.add(caseInfo4);

        // 实际上body里是调用方法读取外部excel/yaml的数据

        return list.toArray();
    }
}
