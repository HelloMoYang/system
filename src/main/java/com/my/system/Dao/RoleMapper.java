package com.my.system.Dao;

import com.my.system.Bean.Role;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper {

    @Select("select * from role where roleID = #{id}")
    public Role findById(Integer id);
}
