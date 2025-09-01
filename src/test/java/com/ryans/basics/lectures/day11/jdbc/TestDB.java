package com.ryans.basics.lectures.day11.jdbc;

public class TestDB {
    // 为了实现数据库的映射类
    // 要求：
    // 1. 成员名字必须与数据库列名一致
    // 2. get/set
    // 3. 空参构造
    private Long id;
    private String name;

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

    @Override
    public String toString() {
        return "TestDB{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
