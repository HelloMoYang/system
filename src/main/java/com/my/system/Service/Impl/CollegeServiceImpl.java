package com.my.system.Service.Impl;

import com.my.system.Bean.College;
import com.my.system.Dao.CollegeMapper;
import com.my.system.Service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeServiceImpl implements CollegeService{

    @Autowired
    private CollegeMapper collegeMapper;

    @Override
    public List<College> getCollegeList() {
        return collegeMapper.getCollegeList();
    }
}
