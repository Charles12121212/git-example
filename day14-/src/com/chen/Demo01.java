package com.chen;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Demo01 {
    public static synchronized void main(String[] args) throws IOException {

        //classloader
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);//类名

        //获取父级 扩展类加载器
        ClassLoader classLoader = systemClassLoader.getParent();
        System.out.println(classLoader);

        //引导类加载器
        ClassLoader loader = classLoader.getParent();
        System.out.println(loader);

        //获取配置信息
        Properties properties = new Properties();

        InputStream stream = classLoader.getResourceAsStream("info.properties");
        System.out.println(properties.getProperty("name"));

        stream.close();
    }

}
