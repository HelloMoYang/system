package com.my.system.Bean;

public class StuCourse {
    private Integer StuCourseId;
    private Integer StudentNum;
    private Integer CourseNum;
    private Integer TeacherNum;
    private Integer Grade;

    public Integer getStuCourseId() {
        return StuCourseId;
    }

    public void setStuCourseId(Integer stuCourseId) {
        StuCourseId = stuCourseId;
    }

    public Integer getStudentNum() {
        return StudentNum;
    }

    public void setStudentNum(Integer studentNum) {
        StudentNum = studentNum;
    }

    public Integer getCourseNum() {
        return CourseNum;
    }

    public void setCourseNum(Integer courseNum) {
        CourseNum = courseNum;
    }

    public Integer getTeacherNum() {
        return TeacherNum;
    }

    public void setTeacherNum(Integer teacherNum) {
        TeacherNum = teacherNum;
    }

    public Integer getGrade() {
        return Grade;
    }

    public void setGrade(Integer grade) {
        Grade = grade;
    }

    @Override
    public String toString() {
        return "StuCourse{" +
                "StuCourseId=" + StuCourseId +
                ", StudentNum=" + StudentNum +
                ", CourseNum=" + CourseNum +
                ", TeacherNum=" + TeacherNum +
                ", Grade=" + Grade +
                '}';
    }
}
