package com.my.system.Bean;

public class Control {
    private Integer IfTakeCourse;
    private Integer IfInputGrade;

    public Integer getIfTakeCourse() {
        return IfTakeCourse;
    }

    public void setIfTakeCourse(Integer ifTakeCourse) {
        IfTakeCourse = ifTakeCourse;
    }

    public Integer getIfInputGrade() {
        return IfInputGrade;
    }

    public void setIfInputGrade(Integer ifInputGrade) {
        IfInputGrade = ifInputGrade;
    }

    @Override
    public String toString() {
        return "Control{" +
                "IfTakeCourse=" + IfTakeCourse +
                ", IfInputGrade=" + IfInputGrade +
                '}';
    }
}
