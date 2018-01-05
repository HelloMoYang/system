package com.my.system.Service.Impl;

import com.my.system.Bean.Course;
import com.my.system.Dao.CourseMapper;
import com.my.system.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> getCourseList() {
        return courseMapper.getAllCourses();
    }

    @Override
    public int addCourse(Course course) {
        return courseMapper.addCourse(course);
    }
}
