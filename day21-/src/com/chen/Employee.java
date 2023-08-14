package com.chen;

import java.sql.Date;

public class Employee {
    private int empno;
    private String ename;
    private Date hiredate;

    private String job;
    private double sal;
    private double comm;


    public Employee() {
    }

    public Employee(int empno, String ename, Date hiredate,
                    String job, double sal, double comm) {
        this.empno = empno;
        this.ename = ename;
        this.hiredate = hiredate;
        this.job = job;
        this.sal = sal;
        this.comm = comm;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", hiredate=" + hiredate +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                ", comm=" + comm +
                '}';
    }
}
