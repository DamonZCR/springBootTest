package com.damon.springBoot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class SpringBootTestApplicationTests {

    @Autowired
    private DataSource dataSource;


    @Test
    public void test() {
        System.out.println(dataSource.getClass());
    }
}
