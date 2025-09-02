package com.ryans.basics.homework.day11.jdbc;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class TestJDBC {
    private Connection connection = null;
    private QueryRunner runner = null;

    @BeforeClass
    public void setUp() {
        connection = JDBCUtils.getConnection();
        runner = new QueryRunner();
    }

    @AfterClass
    public void tearDown() {
        JDBCUtils.close(connection);
    }

    @Test
    public void testAdd() throws SQLException {
        String sql = "INSERT INTO TEST VALUES(7, 'Frank')";
        int count = runner.update(connection, sql);
        System.out.println("test add operation. count: " + count);
    }

    @Test
    public void testUpdate() throws SQLException {
        String sql = "update test set name='Franklin' where id=7";
        int count = runner.update(connection, sql);
        System.out.println("test update operation. count: " + count);
        sql = "select * from test";
        List<Map<String, Object>> list = runner.query(connection, sql, new MapListHandler());
        System.out.println(list);
    }

    @Test
    public void testSelectAll() throws SQLException {
        String sql = "select * from test";
        List<Map<String, Object>> list = runner.query(connection, sql, new MapListHandler());
        System.out.println(list);
    }

    @Test
    public void testSelectSingleRowSingleColumn() throws SQLException {
        String sql = "select count(*) from test";
        Long count = runner.query(connection, sql, new ScalarHandler<>());
        System.out.println("count: " + count);
    }

    @Test
    public void testSelectSingleRowMultipleColumns() throws SQLException {
        String sql = "select * from test where id=7";
        Map<String, Object> map = runner.query(connection, sql, new MapHandler());
        System.out.println(map);
    }

    @Test(priority = 10)
    public void testDelete() throws SQLException {
        String sql = "delete from test where id=7";
        int count = runner.update(connection, sql);
        System.out.println("test delete operation. count: " + count);
    }
}
