package com.chen;

import java.sql.*;

//单表查询
public class Deno01 {

    public static void main(String[] args) throws SQLException {
        //获取连接
        Connection connection = ConnectionUtil.ConnectionUtil();

        //得到连接以后,创建state对象 家炼狱只是的欲

//        Statement statement = new Statement;
        //connection有一个创建预处理对象的方法
        Statement statement = connection.createStatement();

        //得到这个方法以后,先编写SQL
        String sql = "select empno, ename, job, hiredate, sal, comm from emp;";

        //将sql执行命令传入创建的statement中,获取返回值,返回值是result集
        ResultSet resultSet = statement.executeQuery(sql);

        //得到resultSet怎么处理?创建对象把他接住
        //遍历这个集合,resultSet.next().var的返回值是boolean
        while (resultSet.next()){
            int empno = resultSet.getInt("empno");
            String ename = resultSet.getString("ename");
            String job = resultSet.getString("job");
            Date hiredate = resultSet.getDate("hiredate");
            double sal = resultSet.getDouble("sal");
            double comm = resultSet.getDouble("comm");

            //得到的装入Employee对象中
            Employee employee = new Employee(empno,ename,job,hiredate,sal,comm);

            //没有业务,只能打印对象吧 期待奇迹,走!
            System.out.println(employee);
        }
    }
}
