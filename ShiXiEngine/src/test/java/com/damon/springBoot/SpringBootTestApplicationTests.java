package com.damon.springBoot;

import com.damon.springBoot.service.EmployeeServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import javax.sql.DataSource;

@SpringBootTest
class SpringBootTestApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private EmployeeServiceImpl employeeService;

    @Test
    public void test() {
        System.out.println(dataSource.getClass());
    }

    @Test
    public void test3() {
        System.out.println(employeeService.getEmployeeById(1));
    }
}
