package com.my.system.Service.Impl;

import com.my.system.Bean.Teacher;
import com.my.system.Dao.TeacherMapper;
import com.my.system.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService{
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> getTeachers() {
        return teacherMapper.getTeachers();
    }
}
