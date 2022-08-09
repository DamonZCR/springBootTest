package com.damon.springBoot.byService;

import com.damon.springBoot.pojo.ZhResource;
import com.damon.springBoot.service.ZhResourceServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.util.Iterator;
import java.util.List;

@SpringBootTest
public class ZhResourceServiceTest {
    @Autowired
    private DataSource dataSource;

    @Autowired
    private ZhResourceServiceImpl zhResourceService;

    @Test
    public void test() {
        System.out.println(dataSource.getClass());
    }

    @Test
    public void test1(){
        List<ZhResource> zhResources = zhResourceService.selectAllResource();
        Iterator<ZhResource> iterator = zhResources.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2(){
        ZhResource zr = new ZhResource();
        zr.setType(12);
        zr.setId("112");
        zr.setAuth("0101");
        zhResourceService.insert(zr);
    }
}
