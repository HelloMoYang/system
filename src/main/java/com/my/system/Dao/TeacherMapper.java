package com.my.system.Dao;

import com.my.system.Bean.Teacher;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherMapper {

    @Select("select * from teacher")
    public List<Teacher> getTeachers();
}
