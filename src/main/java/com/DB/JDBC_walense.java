package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_walense {
    public static String DRIVERNAME = "com.mysql.jdbc.Driver";
    public static String URL = "jdbc:mysql://47.107.71.85:3306/walense";
    public static String USER = "root";
    public static String PASSWORD = "123456";
 
    public static Connection conn = null;
 
 
    public static Connection getConnection() throws Exception {
        if (conn != null) {
            return conn;
        }
        /* 1.加载驱动程序,
		 * 可以用DriverManager.registerDriver(new com.mysql.jdbc.Driver());代替*/
        Class.forName(DRIVERNAME);
        // 2. 获得数据库连接
        conn = DriverManager.getConnection(URL, USER, PASSWORD);
 
        return conn;
    }
 
    public static void closeResource(Connection conn, PreparedStatement st) throws SQLException {
        st.close();
        conn.close();
    }
 
    public static void closeResource(Connection conn, ResultSet rs, PreparedStatement pt) throws SQLException {
        pt.close();
        rs.close();
        conn.close();
    }
	
}
