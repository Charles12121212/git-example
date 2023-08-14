package com.chen;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class connectionUtil {

    private connectionUtil(){}

    private static String driverClassName;
    private static String url;
    private static String username;
    private static String password;

    static {
        //读取配置信息
        Properties properties = new Properties();
        InputStream in = ClassLoader.getSystemClassLoader().
                getResourceAsStream("jdbc.properties");
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //给字段赋值
        driverClassName = properties.getProperty("driverClassName");
        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");
        //加载驱动
        try {
            Class.forName(driverClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //建立连接
    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }
    //释放资源
    public static void close(AutoCloseable... autoCloseables){
        //避免空指针异常
        if (autoCloseables != null){
            for(AutoCloseable autoCloseable : autoCloseables){
                if (autoCloseable != null){
                    try {
                        autoCloseable.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }









}
