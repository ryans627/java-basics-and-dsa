package com.ryans.basics.lectures.day11.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {

    public static final String URL = "jdbc:mysql://127.0.0.1:8889/mydatabase?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "root";

    /**
     * 获取数据库连接
     * @return Connection
     */
    public static Connection getConnection() {
        Connection conn = null;
        try {
            // 1. 获取连接
            conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD); // 这里不抛出异常，而是处理异常
            return conn;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 关闭数据库连接
     * @param conn
     */
    public static void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
