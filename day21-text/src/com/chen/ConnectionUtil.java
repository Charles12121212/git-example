package com.chen;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
    private static String driverClassName;
    private static String url;
    private static String username;
    private static String password;

    //通过类加载器加载系统资源,以流的形式加载
    static {
        InputStream in = ClassLoader.getSystemClassLoader()
                .getResourceAsStream("jdbc.properties");

        //创建properties对象,传入流读到的参数
        Properties properties = new Properties();

        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //流读完了,关流
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //将得到的properties的属性给成员变量赋值
        driverClassName = properties.getProperty("driverClassName");
        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");

        //得到的driverClassName=com.mysql.jdbc.Driver 就是jdbc的驱动
        //所以直接反射,加载驱动
        try {
            Class.forName(driverClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //创建静态方法,获取连接
    public static Connection ConnectionUtil() throws SQLException {
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }
    //关流,由于都实现了Auto接口,用动态变量
    public static void close(AutoCloseable... autoCloseables){
        //把autoCloseables当成数组用,先判断数组不为空
        if (autoCloseables != null){
            //遍历数组
            for (AutoCloseable autoCloseable : autoCloseables) {
                //判断每个元素不为空
                if (autoCloseable != null){
                    //就关闭
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
