package com.my.system.Dao;

import com.my.system.Bean.College;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollegeMapper {

    @Select("select * from college")
    public List<College> getCollegeList();
}
