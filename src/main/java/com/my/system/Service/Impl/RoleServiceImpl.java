package com.my.system.Service.Impl;

import com.my.system.Bean.Role;
import com.my.system.Dao.RoleMapper;
import com.my.system.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Role findById(Integer id) {
        return roleMapper.findById(id);
    }
}
