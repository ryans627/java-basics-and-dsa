package com.ryans.basics.lectures.day08;

// Java中自定义对象 和 JSON字符串 相互转换的必要条件：
// 1. 私有属性
// 2. 对应GET和SET方法
// 3. 空参构造 (Java类默认会自动创建空参构造方法）
public class Student {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
