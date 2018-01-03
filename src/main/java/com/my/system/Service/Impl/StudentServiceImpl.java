package com.my.system.Service.Impl;

import com.my.system.Bean.College;
import com.my.system.Bean.Student;
import com.my.system.Dao.StudentMapper;
import com.my.system.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Map<Student,College> getStudentList() {
        Map<Student,College> map = new LinkedHashMap<>();
        for (Student student: studentMapper.getStudentList()){
            map.put(student,studentMapper.getCollege(student.getCollegeid()));
        }
        return map;
    }

}
