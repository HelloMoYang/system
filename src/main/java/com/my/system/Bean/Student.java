package com.my.system.Bean;

import java.util.Date;

public class Student {
    private Integer StudentNum;
    private Integer MajorNum;
    private String StudentName;
    private String StudentSex;
    private Date StudentBirthday;
    private String StudentPassword;

    public Integer getStudentNum() {
        return StudentNum;
    }

    public Integer getMajorNum() {
        return MajorNum;
    }

    public String getStudentName() {
        return StudentName;
    }

    public String getStudentSex() {
        return StudentSex;
    }

    public Date getStudentBirthday() {
        return StudentBirthday;
    }

    public String getStudentPassword() {
        return StudentPassword;
    }

    public void setStudentNum(Integer studentNum) {
        StudentNum = studentNum;
    }

    public void setMajorNum(Integer majorNum) {
        MajorNum = majorNum;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public void setStudentSex(String studentSex) {
        StudentSex = studentSex;
    }

    public void setStudentBirthday(Date studentBirthday) {
        StudentBirthday = studentBirthday;
    }

    public void setStudentPassword(String studentPassword) {
        StudentPassword = studentPassword;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentNum=" + StudentNum +
                ", MajorNum=" + MajorNum +
                ", StudentName='" + StudentName + '\'' +
                ", StudentSex='" + StudentSex + '\'' +
                ", StudentBirthday=" + StudentBirthday +
                ", StudentPassword='" + StudentPassword + '\'' +
                '}';
    }
}
