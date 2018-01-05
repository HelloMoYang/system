package com.my.system.Dao;

import com.my.system.Bean.Course;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseMapper {

    @Select("select * from course")
    public List<Course> getAllCourses();

    @Insert("insert into course(courseID,courseName,teacherID,courseTime,classRoom,courseWeek,courseType,collegeID,score) " +
            "values(#{courseid},#{coursename},#{teacherid},#{coursetime},#{classroom},#{courseweek},#{coursetype},#{collegeid},#{score})")
    public int addCourse(Course course);
}
