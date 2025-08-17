package com.ryans.basics.lectures.day08;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JsonDemo {
    public static void main(String[] args) throws JsonProcessingException {
        // 1. 把JSON字符串 转换成 Java对象
        String str = "{\"name\":\"rose\",\"age\":10}";

        // 1.1 json字符串直接转HashMap
        ObjectMapper mapper = new ObjectMapper();
        // readValue(json字符串, 希望转换成的java类名.class)
        Map<String, Object> map = mapper.readValue(str, Map.class);
        System.out.println(map);

        // 1.2 json字符串转化为Java中的自定义对象
        Student student = mapper.readValue(str, Student.class);
        System.out.println(student);

        // 2. java对象 转换成 JSON字符串

        // 2.1 Map转换为JSON字符串
        String newJsonStr = mapper.writeValueAsString(map);
        System.out.println(newJsonStr);

        // 2.2 Java自定义对象转换为JSON字符串
        String s = mapper.writeValueAsString(student);
        System.out.println(s);

        // 3. 集合 转换成 json字符串
        List<String> list = new ArrayList<>();
        list.add("游戏");
        list.add("旅游");
        list.add("电影");
        String str2 = mapper.writeValueAsString(list);
        System.out.println(str2);
    }
}
