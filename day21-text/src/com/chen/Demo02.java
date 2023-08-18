package com.chen;

import java.sql.*;

//多表查询,就是多个对象
public class Demo02 {
    public static void main(String[] args) throws SQLException {
        //获取连接
        Connection connection = ConnectionUtil.ConnectionUtil();

        //得到连接以后,创建state对象 家炼狱只是的欲

//        Statement statement = new Statement;
        //connection有一个预处理对象的方法
        Statement statement = connection.createStatement();

        //得到这个方法以后,先编写SQL
        String sql = "select \n" +
                "e.empno, e.ename, e.job,\n" +
                "e.hiredate, e.sal, e.comm,\n" +
                "d.DNAME,d.deptno, d.loc\n" +
                "from emp e\n" +
                "left JOIN dept d\n" +
                "on e.DEPTNO = d.DEPTNO;";

        //将sql执行命令传入创建的statement中,获取返回值,返回值是result集
        ResultSet resultSet = statement.executeQuery(sql);

        //得到resultSet怎么处理?创建对象把他接住
        //遍历这个集合,resultSet.next().var的返回值是boolean
        while (resultSet.next()){
            //Employee对象的属性初始化
            int empno = resultSet.getInt("e.empno");
            String ename = resultSet.getString("e.ename");
            String job = resultSet.getString("job");
            Date hiredate = resultSet.getDate("hiredate");
            double sal = resultSet.getDouble("sal");
            double comm = resultSet.getDouble("comm");

            //dept对象的属性初始化
            int deptno = resultSet.getInt("deptno");
            String dname = resultSet.getString("dname");
            String loc = resultSet.getString("loc");

            //得到的装入Employee对象中
            Employee employee = new Employee(empno,ename,job,hiredate,sal,comm);
            //得到的装入dept对象中
            dept dept = new dept(deptno,dname,loc);

            //没有业务,只能打印对象吧 期待奇迹,走!
            System.out.print(employee);
            System.out.println(dept);
        }
    }
}
