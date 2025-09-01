package com.ryans.basics.lectures.day11.jdbc;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

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

    /**
     * 查询结果是单行单列
     * @throws SQLException
     */
    @Test
    public void testSelectQuerySingleRowSingleColumn() throws SQLException {
        // 1. DBUtils 核心类: QueryRunner
        QueryRunner runner = new QueryRunner();
        // 2. 获取数据库连接
        Connection conn = JDBCUtils.getConnection();
        // 3. 定义sql语句
        String sql = "select count(*) from test";
        // 4. 运行sql语句
        // 创建查询结果handler：如果结果是单行单列 => ScalarHandler
        ScalarHandler<Long> handler = new ScalarHandler<>();
        Long count = runner.query(conn, sql, handler);
        System.out.println("count: " + count); // 5
        // 3. 关闭数据库连接
        JDBCUtils.close(conn);
    }

    /**
     * 查询结果是单行多列
     * @throws SQLException
     */
    @Test
    public void testSelectQuerySingleRowMultipleColumns() throws SQLException {
        // 1. DBUtils 核心类: QueryRunner
        QueryRunner runner = new QueryRunner();
        // 2. 获取数据库连接
        Connection conn = JDBCUtils.getConnection();
        // 3. 定义sql语句
        String sql = "select * from test where id=5";
        // 4. 运行sql语句
        // ResultSetHandler接口，用于定义select操作后，怎样封装结果集
        // BeanHandler是这个接口的实现类
        // 创建查询结果handler：如果结果是单行多列 => BeanHandler
        // 我们把数据库中一行数据封装成一个java对象
        BeanHandler<TestDB> handler = new BeanHandler<>(TestDB.class);
        TestDB res = runner.query(conn, sql, handler);
        System.out.println("res: " + res); // res: TestDB{id=5, name='Asepa'}
        // 5. 关闭数据库连接
        JDBCUtils.close(conn);
    }

    /**
     * MapHandler: 查询结果是单行多列
     * @throws SQLException
     */
    @Test
    public void testSelectQueryMapHandler() throws SQLException {
        // 1. DBUtils 核心类: QueryRunner
        QueryRunner runner = new QueryRunner();
        // 2. 获取数据库连接
        Connection conn = JDBCUtils.getConnection();
        // 3. 定义sql语句
        String sql = "select * from test where id=5";
        // 4. 运行sql语句
        // 使用MapHandler接收结果，得到的是map
        MapHandler handler = new MapHandler();
        Map<String, Object> map = runner.query(conn, sql, handler);
        System.out.println("map: " + map); // map: {id=5, name=Asepa}
        // 5. 关闭数据库连接
        JDBCUtils.close(conn);
    }

    /**
     * MapListHandler: 查询结果是多行多列 => list of map
     * @throws SQLException
     */
    @Test
    public void testSelectQueryMapListHandler() throws SQLException {
        // 1. DBUtils 核心类: QueryRunner
        QueryRunner runner = new QueryRunner();
        // 2. 获取数据库连接
        Connection conn = JDBCUtils.getConnection();
        // 3. 定义sql语句
        String sql = "select * from test";
        // 4. 运行sql语句
        // 使用MapListHandler接收结果，得到的是list of map
        MapListHandler handler = new MapListHandler();
        List<Map<String, Object>> list = runner.query(conn, sql, handler);
        System.out.println("list: " + list); // list: [{id=1, name=Apple}, {id=2, name=Banana}, {id=3, name=Orange}, {id=5, name=Asepa}, {id=33, name=Ryan Shang}]
        // 5. 关闭数据库连接
        JDBCUtils.close(conn);
    }

    /**
     * BeanListHandler: 查询结果是多行多列 => list of BeanHandler
     * @throws SQLException
     */
    @Test
    public void testSelectQueryBeanListHandler() throws SQLException {
        // 1. DBUtils 核心类: QueryRunner
        QueryRunner runner = new QueryRunner();
        // 2. 获取数据库连接
        Connection conn = JDBCUtils.getConnection();
        // 3. 定义sql语句
        String sql = "select * from test";
        // 4. 运行sql语句
        // 使用BeanListHandler接收结果，得到的是List of BeanHandler
        // 可以在实参中现场new出来
        List<TestDB> list = runner.query(conn, sql, new BeanListHandler<>(TestDB.class));
        System.out.println("list: " + list);
        // list: [TestDB{id=1, name='Apple'}, TestDB{id=2, name='Banana'}, TestDB{id=3, name='Orange'}, TestDB{id=5, name='Asepa'}, TestDB{id=33, name='Ryan Shang'}]
        // 5. 关闭数据库连接
        JDBCUtils.close(conn);
    }
}
