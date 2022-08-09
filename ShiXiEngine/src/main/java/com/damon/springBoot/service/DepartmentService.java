package com.damon.springBoot.service;

import com.damon.springBoot.dto.Department;
import java.util.List;

/**
 * @author: 吴磊
 * @program: springboot-03-web
 * @create: 2021-01-29 14:16
 */
public interface DepartmentService {

    List<Department> getAll();
}
