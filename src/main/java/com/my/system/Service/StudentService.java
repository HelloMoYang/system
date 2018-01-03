package com.my.system.Service;

import com.my.system.Bean.College;
import com.my.system.Bean.Student;

import java.util.Map;

public interface StudentService {
    public Map<Student, College> getStudentList();
}
