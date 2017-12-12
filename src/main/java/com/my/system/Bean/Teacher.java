package com.my.system.Bean;

import java.util.Date;

public class Teacher {
    private Integer TeacherNum;
    private Integer DeptNum;
    private String TeacherName;
    private String TeacherSex;
    private Date TeacherBirthday;
    private String TeacherTitle;
    private String TeacherPassword;

    public Integer getTeacherNum() {
        return TeacherNum;
    }

    public void setTeacherNum(Integer teacherNum) {
        TeacherNum = teacherNum;
    }

    public Integer getDeptNum() {
        return DeptNum;
    }

    public void setDeptNum(Integer deptNum) {
        DeptNum = deptNum;
    }

    public String getTeacherName() {
        return TeacherName;
    }

    public void setTeacherName(String teacherName) {
        TeacherName = teacherName;
    }

    public String getTeacherSex() {
        return TeacherSex;
    }

    public void setTeacherSex(String teacherSex) {
        TeacherSex = teacherSex;
    }

    public Date getTeacherBirthday() {
        return TeacherBirthday;
    }

    public void setTeacherBirthday(Date teacherBirthday) {
        TeacherBirthday = teacherBirthday;
    }

    public String getTeacherTitle() {
        return TeacherTitle;
    }

    public void setTeacherTitle(String teacherTitle) {
        TeacherTitle = teacherTitle;
    }

    public String getTeacherPassword() {
        return TeacherPassword;
    }

    public void setTeacherPassword(String teacherPassword) {
        TeacherPassword = teacherPassword;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "TeacherNum=" + TeacherNum +
                ", DeptNum=" + DeptNum +
                ", TeacherName='" + TeacherName + '\'' +
                ", TeacherSex='" + TeacherSex + '\'' +
                ", TeacherBirthday=" + TeacherBirthday +
                ", TeacherTitle='" + TeacherTitle + '\'' +
                ", TeacherPassword='" + TeacherPassword + '\'' +
                '}';
    }
}
