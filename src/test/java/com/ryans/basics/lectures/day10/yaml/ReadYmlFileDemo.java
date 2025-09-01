package com.ryans.basics.lectures.day10.yaml;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;

public class ReadYmlFileDemo {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        Student student = mapper.readValue(new File("src/test/resources/student.yml"), Student.class);
        System.out.println(student);
    }
}
