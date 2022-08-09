package com.damon.springBoot.service;

import com.damon.springBoot.dto.Employee;
import java.util.List;

/**
 */
public interface EmployeeService {
    List<Employee> getAll();

    //通过ID查询员工
    Employee getEmployeeById(int id);

    //通过ID删除员工
    int delete(int id);

    //增加一个员工
    int save(Employee employee);

    int updateEmpById(Employee employee);
}
