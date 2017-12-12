package com.my.system.Bean;

public class Course {
    private Integer CourseNum;
    private String CourseName;
    private float CourseCredit;
    private Integer CourseClass;
    private String CourseDesc;

    public Integer getCourseNum() {
        return CourseNum;
    }

    public void setCourseNum(Integer courseNum) {
        CourseNum = courseNum;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public float getCourseCredit() {
        return CourseCredit;
    }

    public void setCourseCredit(float courseCredit) {
        CourseCredit = courseCredit;
    }

    public Integer getCourseClass() {
        return CourseClass;
    }

    public void setCourseClass(Integer courseClass) {
        CourseClass = courseClass;
    }

    public String getCourseDesc() {
        return CourseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        CourseDesc = courseDesc;
    }

    @Override
    public String toString() {
        return "Course{" +
                "CourseNum=" + CourseNum +
                ", CourseName='" + CourseName + '\'' +
                ", CourseCredit=" + CourseCredit +
                ", CourseClass=" + CourseClass +
                ", CourseDesc='" + CourseDesc + '\'' +
                '}';
    }
}
