package com.chen;

import java.sql.*;

public class Demo04 {
    public static void main(String[] args) throws SQLException {
        Connection connection = connectionUtil.getConnection();
        Statement statement = connection.createStatement();

        //处理sql的对象
        String sql = "select empno, ename, hiredate, job, sal, comm from emp";
        ResultSet resultSet = statement.executeQuery(sql);
        //执行操作
        while (resultSet.next()){
            int empno = resultSet.getInt("empno");
            String ename = resultSet.getString("ename");
            Date hiredate = resultSet.getDate("hiredate");

            String job = resultSet.getString("job");
            double sal = resultSet.getDouble("sal");
            double comm = resultSet.getDouble("comm");

            // 封装一个java对象
            Employee employee = new Employee(empno,ename,hiredate,job,sal,comm);
            System.out.println(employee);

        }

        connectionUtil.close(resultSet,statement,connection);

    }



}
