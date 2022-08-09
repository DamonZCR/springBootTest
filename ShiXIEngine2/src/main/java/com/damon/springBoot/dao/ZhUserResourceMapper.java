package com.damon.springBoot.dao;

import com.damon.springBoot.pojo.ZhResource;
import com.damon.springBoot.pojo.ZhUserResource;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Mapper
public interface ZhUserResourceMapper {
    int insertUserResource(ZhUserResource record);

    int insertSelective(ZhUserResource record);

    List<ZhUserResource> selectAllUserResource();

    List<ZhUserResource> selectUserResourceById(String id);
    // 通过用户的ID查询它所对应的所有资源
    List<ZhResource> selectResourceByUserId(String id);

    int deleteUserResourceById(String id);

    int updateUserResourceById(ZhUserResource record);
}