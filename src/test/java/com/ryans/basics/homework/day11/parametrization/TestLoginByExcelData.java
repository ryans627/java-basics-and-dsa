package com.ryans.basics.homework.day11.parametrization;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.List;

public class TestLoginByExcelData {

    @Test(dataProvider = "excelData")
    public void testLogin(Student student) {
        System.out.println("测试登录功能");
        System.out.println(student.getId() + student.getName() + student.getAge());
    }

    /**
     * 从本地Excel文件中读取数据并解析为定义好的Student对象，返回Student数组
     *
     * @return
     */
    @DataProvider
    public Object[] excelData() throws Exception {
        // Step 1: 创建数据流
        FileInputStream fis = new FileInputStream("src/test/resources/test.xlsx");
        // Step 2: 读取Excel数据
        List<Student> students = ExcelImportUtil.importExcel(fis, Student.class, new ImportParams());
        System.out.println(students);
        return students.toArray();
    }
}
