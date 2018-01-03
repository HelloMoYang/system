package com.my.system.Dao;

import com.my.system.Bean.College;
import com.my.system.Bean.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {

    @Select("select * from student")
    public List<Student> getStudentList();

    @Select("select * from college where collegeID = #{id}")
    public College getCollege(Integer id);
}
