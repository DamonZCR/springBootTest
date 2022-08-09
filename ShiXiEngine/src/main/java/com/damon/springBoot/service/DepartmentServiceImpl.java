package com.damon.springBoot.service;

import com.damon.springBoot.mapper.DepartmentMapper;
import com.damon.springBoot.dto.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 吴磊
 * @program: springboot-03-web
 * @create: 2021-01-29 14:16
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getAll() {
        return departmentMapper.getAll();
    }
}
