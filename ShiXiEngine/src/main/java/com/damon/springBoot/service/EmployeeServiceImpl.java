package com.damon.springBoot.service;

import com.damon.springBoot.mapper.EmployeeMapper;
import com.damon.springBoot.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAll() {
        return employeeMapper.getAll();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeMapper.getEmployeeById(id);
    }

    @Override
    public int delete(int id) {
        return employeeMapper.delete(id);
    }

    @Override
    public int save(Employee employee) {
        return employeeMapper.save(employee);
    }

    @Override
    public int updateEmpById(Employee employee) {
        return employeeMapper.updateEmpById(employee);
    }
}
