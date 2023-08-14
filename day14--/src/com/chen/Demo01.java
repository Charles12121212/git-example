package com.chen;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo01 {
    public static void main(String[] args) throws Exception {
        // 读取配置文件中的信息
        InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream("info.properties");
        Properties properties = new Properties();
        properties.load(stream);

        // 获取配置的类名和方法名
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        // 反射技术创建对象
        Class clazz = Class.forName(className);

        Object obj = clazz.getDeclaredConstructor().newInstance();

        // 获取方法
        Method method = clazz.getMethod(methodName);

        // 执行
        method.invoke(obj);


    }
}
