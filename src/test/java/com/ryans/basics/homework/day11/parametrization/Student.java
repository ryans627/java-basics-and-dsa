package com.ryans.basics.homework.day11.parametrization;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class Student {
    @Excel(name = "编号")
    private Long id;
    @Excel(name = "姓名")
    private String name;
    @Excel(name = "年龄")
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
