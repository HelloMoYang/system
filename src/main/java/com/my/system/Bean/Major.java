package com.my.system.Bean;

public class Major {
    private Integer MajorNum;
    private Integer DeptNum;
    private String MajorName;
    private String MajorAssistant;
    private Integer MajorTel;

    public Integer getMajorNum() {
        return MajorNum;
    }

    public void setMajorNum(Integer majorNum) {
        MajorNum = majorNum;
    }

    public Integer getDeptNum() {
        return DeptNum;
    }

    public void setDeptNum(Integer deptNum) {
        DeptNum = deptNum;
    }

    public String getMajorName() {
        return MajorName;
    }

    public void setMajorName(String majorName) {
        MajorName = majorName;
    }

    public String getMajorAssistant() {
        return MajorAssistant;
    }

    public void setMajorAssistant(String majorAssistant) {
        MajorAssistant = majorAssistant;
    }

    public Integer getMajorTel() {
        return MajorTel;
    }

    public void setMajorTel(Integer majorTel) {
        MajorTel = majorTel;
    }

    @Override
    public String toString() {
        return "Major{" +
                "MajorNum=" + MajorNum +
                ", DeptNum=" + DeptNum +
                ", MajorName='" + MajorName + '\'' +
                ", MajorAssistant='" + MajorAssistant + '\'' +
                ", MajorTel=" + MajorTel +
                '}';
    }
}
