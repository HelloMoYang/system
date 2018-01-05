package com.my.system.Service;

import com.my.system.Bean.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourseList();
    public int addCourse(Course course);
}
