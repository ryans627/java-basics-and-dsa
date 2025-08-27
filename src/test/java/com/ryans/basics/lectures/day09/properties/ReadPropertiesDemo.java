package com.ryans.basics.lectures.day09.properties;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertiesDemo {
    public static void main(String[] args) throws Exception {
        // 接口：干爹；父类：亲爹
        // HashTable, HashMap都实现了Map接口, 具备相似的功能
        // Properties 继承 Hashtable, 相当于间接地实现了Map接口
        // Properties类不用声明范型，默认是<String, String>范型
        Properties prop = new Properties();

        // 现在希望加载本地的配置文件
        // Step 1: 先创建一个 文件输入流 FileInputStream
        FileInputStream fis = new FileInputStream("src/test/resources/test.properties");
        prop.load(fis);
        System.out.println(prop); // {age=19, name=zhangsan}
        // Step 2: 读取配置文件的值
        System.out.println(prop.getProperty("age")); // 19
        fis.close();
    }
}
