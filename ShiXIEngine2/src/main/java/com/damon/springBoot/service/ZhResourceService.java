package com.damon.springBoot.service;

import com.damon.springBoot.pojo.ZhResource;
import java.util.List;

public interface ZhResourceService {
    int insert(ZhResource record);

    int insertSelective(ZhResource record);

    List<ZhResource> selectAllResource();

    List<ZhResource> selectAllResourceById(String id);

    int deleteById(String id);

    int updateById(ZhResource record);
}
