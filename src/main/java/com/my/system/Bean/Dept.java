package com.my.system.Bean;

public class Dept {
    private Integer DeptNum;
    private String DeptName;
    private String DeptChairman;
    private Integer DeptTel;
    private String DeptDesc;

    public Integer getDeptNum() {
        return DeptNum;
    }

    public void setDeptNum(Integer deptNum) {
        DeptNum = deptNum;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public String getDeptChairman() {
        return DeptChairman;
    }

    public void setDeptChairman(String deptChairman) {
        DeptChairman = deptChairman;
    }

    public Integer getDeptTel() {
        return DeptTel;
    }

    public void setDeptTel(Integer deptTel) {
        DeptTel = deptTel;
    }

    public String getDeptDesc() {
        return DeptDesc;
    }

    public void setDeptDesc(String deptDesc) {
        DeptDesc = deptDesc;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "DeptNum=" + DeptNum +
                ", DeptName='" + DeptName + '\'' +
                ", DeptChairman='" + DeptChairman + '\'' +
                ", DeptTel=" + DeptTel +
                ", DeptDesc='" + DeptDesc + '\'' +
                '}';
    }
}
