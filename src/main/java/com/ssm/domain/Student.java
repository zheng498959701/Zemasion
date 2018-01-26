package com.ssm.domain;

import java.io.Serializable;

/**
 * Created by zmc on 18/1/26.
 */
public class Student implements Serializable{
    private int sid;
    private String sname;
    private String password;

    public Student() {
    }

    public Student(String sname, String password) {
        this.sname = sname;
        this.password = password;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
