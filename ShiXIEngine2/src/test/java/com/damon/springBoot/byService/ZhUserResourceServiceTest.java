package com.damon.springBoot.byService;

import com.damon.springBoot.dto.ZhUserResourceDto;
import com.damon.springBoot.pojo.ZhResource;
import com.damon.springBoot.pojo.ZhUserResource;
import com.damon.springBoot.service.ZhUserResourceServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class ZhUserResourceServiceTest {
    @Autowired
    private DataSource dataSource;

    @Autowired
    private ZhUserResourceServiceImpl userResourceService;

    @Test
    public void test() {
        System.out.println(dataSource.getClass());
    }
    @Test
    public void test1(){
        ZhUserResourceDto res = userResourceService.selectResourceByUserIdAndType(String.valueOf(4));

        System.out.println(res.getUserId());
        Map<String, List<ZhResource>> resources = res.getResources();
        for (Map.Entry<String, List<ZhResource>> entry: resources.entrySet()) {
            String one = entry.getKey();
            List<ZhResource> two = entry.getValue();
            System.out.println(one + "-----> "+ two);
        }
    }
    @Test
    public void test2(){
        ZhUserResource zur = new ZhUserResource();
        zur.setUserId("55");
        zur.setResourceId("09");
        zur.setRoleType(1);
        userResourceService.insertUserResource(zur);
    }
}
