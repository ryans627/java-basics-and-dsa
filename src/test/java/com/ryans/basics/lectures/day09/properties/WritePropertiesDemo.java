package com.ryans.basics.lectures.day09.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class WritePropertiesDemo {
    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        // 首先在prop中配置好key-value
        prop.setProperty("username", "root");
        prop.setProperty("password", "123456");
        prop.setProperty("port", "3306");
        System.out.println(prop);
        // 创建一个文件输出流: 会清空原来文件的内容. 要谨慎使用
        FileOutputStream fos = new FileOutputStream("src/test/resources/test.properties");
        // 存储到本地文件
        prop.store(fos, "备注");
        // 关流: 不关会一直存在，被锁住，且占据资源
        fos.close();
    }
}
