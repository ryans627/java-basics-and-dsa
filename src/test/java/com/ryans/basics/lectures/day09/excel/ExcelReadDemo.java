package com.ryans.basics.lectures.day09.excel;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;

import java.io.FileInputStream;
import java.util.List;

public class ExcelReadDemo {
    public static void main(String[] args) throws Exception {
        // Step 1: create file io
        // excel的列名："编号", "姓名", "年龄"
        FileInputStream fis = new FileInputStream("src/test/resources/test.xlsx");
        // Step 2: 导入
        // importExcel(excel文件流,一行数据对应的Java对象,导入参数类)
        // 直接创建出来导入参数类, 默认参数
        ImportParams importParams = new ImportParams();
        // 指定从第几个sheet开始读取
        importParams.setStartSheetIndex(0);
        // 指定一次性读几个sheet
        importParams.setSheetNum(1);
        List<Student> students = ExcelImportUtil.importExcel(fis, Student.class, importParams);

        // 遍历Student列表
        for (Student student : students) {
            System.out.println(student);
            System.out.println(student.getId() + ", " + student.getName() + ", " + student.getAge());
        }
    }
}
