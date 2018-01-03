package com.my.system.Dao;

import com.my.system.Bean.Course;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseMapper {

    @Select("select * from course")
    public List<Course> getAllCourses();
}
