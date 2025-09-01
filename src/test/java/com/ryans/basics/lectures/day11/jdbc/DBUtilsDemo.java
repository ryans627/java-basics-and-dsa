package com.ryans.basics.lectures.day11.jdbc;

import org.apache.commons.dbutils.QueryRunner;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class DBUtilsDemo {
    @Test
    public void testInsert() throws SQLException {
        // 1. DBUtils 核心类: QueryRunner
        QueryRunner runner = new QueryRunner();
        // 2. 获取数据库连接
        Connection conn = JDBCUtils.getConnection();
        // 3. 定义SQL语句
        String sql = "insert into test values(4,'Nicole')";
        // 4. 执行SQL语句
        int num = runner.update(conn, sql);
        System.out.println("num is: " + num); // num is: 1
        // 5. 关闭数据库连接, 释放资源
        JDBCUtils.close(conn);
    }

    @Test
    public void testUpdate() throws SQLException {
        // 1. DBUtils 核心类: QueryRunner
        QueryRunner runner = new QueryRunner();
        // 2. 获取数据库连接
        Connection conn = JDBCUtils.getConnection();
        String sql = "update test set name='Nick' where id=4";
        int num = runner.update(conn, sql);
        System.out.println("num is: " + num); // num is: 1
        // 3. 关闭数据库连接
        JDBCUtils.close(conn);
    }

    @Test
    public void testDelete() throws SQLException {
        // 1. DBUtils 核心类: QueryRunner
        QueryRunner runner = new QueryRunner();
        // 2. 获取数据库连接
        Connection conn = JDBCUtils.getConnection();
        String sql = "delete from test where id=4";
        int num = runner.update(conn, sql);
        System.out.println("num is: " + num); // num is: 1
        // 3. 关闭数据库连接
        JDBCUtils.close(conn);
    }
}
