package com.ryans.basics.homework.day10.yml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

/*
将以下json字符串转成YAML：

{ "name": "中国", "provinces": [{ "name": "黑龙江", "capital": "哈尔滨" }, { "name": "广东", "capital": "广州" }, { "name": "湖南", "capital": "长沙" }] }
 */

public class JsonToYml {
    public static void main(String[] args) throws JsonProcessingException {
        String jsonStr = "{ \"name\": \"中国\", \"provinces\": [{ \"name\": \"黑龙江\", \"capital\": \"哈尔滨\" }, { \"name\": \"广东\", \"capital\": \"广州\" }, { \"name\": \"湖南\", \"capital\": \"长沙\" }] }";
        // Step 1: 将json string 转化为Java自定义对象
        ObjectMapper mapper = new ObjectMapper();
        Country country = mapper.readValue(jsonStr, Country.class);
        System.out.println(country); // Country{name='中国', provinces=[Province{name='黑龙江', capital='哈尔滨'}, Province{name='广东', capital='广州'}, Province{name='湖南', capital='长沙'}]}

        // Step 2: 将Java自定义对象转化为yaml文件
        mapper = new ObjectMapper(new YAMLFactory());
        String ymlStr = mapper.writeValueAsString(country);
        System.out.println(ymlStr);
    }
}
