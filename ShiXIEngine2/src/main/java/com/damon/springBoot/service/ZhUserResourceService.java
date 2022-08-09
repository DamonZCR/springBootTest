package com.damon.springBoot.service;

import com.damon.springBoot.dto.ZhResourceDto;
import com.damon.springBoot.dto.ZhUserResourceDto;
import com.damon.springBoot.pojo.ZhResource;
import com.damon.springBoot.pojo.ZhUserResource;

import java.util.List;

public interface ZhUserResourceService {
    int insertUserResource(ZhUserResource record);

    int insertSelective(ZhUserResource record);

    List<ZhUserResource> selectAllUserResource();

    List<ZhUserResource> selectUserResourceById(String id);
    // 通过用户的ID查询它所对应的所有资源
    ZhUserResourceDto selectResourceByUserIdAndType(String id);

    List<ZhResource> selectResourceByUserId(String id);

    int deleteUserResourceById(String id);

    int updateUserResourceById(ZhUserResource record);
}
