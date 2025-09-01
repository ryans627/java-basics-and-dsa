package com.ryans.basics.lectures.day10.yaml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.util.HashMap;

public class YmlDemo {
    public static void main(String[] args) throws JsonProcessingException {
        // 传入一个yaml解析器
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        String str = "address:\n" +
                "  province: 湖南省\n" +
                "  city: 长沙市";
        // yaml字符转出map
        HashMap hashMap = mapper.readValue(str, HashMap.class);
        System.out.println(hashMap.get("address")); // {province=湖南省, city=长沙市}

        // yml转Java的自定义对象
        str = "name: 张三\n" +
                "age: 20\n" +
                "height: 179.9\n";
        Student student = mapper.readValue(str, Student.class);
        System.out.println(student); // Student{name='张三', age=20, height=179.9}
    }
}
