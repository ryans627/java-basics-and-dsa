package com.ryans.basics.lectures.day09.excel;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelWriteDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src/test/resources/testwrite.xls");
        ExportParams exportParams = new ExportParams();
        // exportExcel(导出参数类,映射类,数据集合)
        List<Student> list = new ArrayList<>();
        Student s1 = new Student();
        s1.setAge("17");
        s1.setId("1");
        s1.setName("Ryan");

        Student s2 = new Student();
        s2.setAge("20");
        s2.setId("2");
        s2.setName("Nicole");

        list.add(s1);
        list.add(s2);

        Workbook workbook = ExcelExportUtil.exportExcel(exportParams, Student.class, list);
        // 回写
        workbook.write(fos);
        // 关流
        fos.close();
    }
}
