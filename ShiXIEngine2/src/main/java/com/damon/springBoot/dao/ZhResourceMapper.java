package com.damon.springBoot.dao;

import com.damon.springBoot.pojo.ZhResource;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Mapper
public interface ZhResourceMapper {
    int insert(ZhResource record);

    int insertSelective(ZhResource record);

    List<ZhResource> selectAllResource();

    List<ZhResource> selectAllResourceById(String id);

    int deleteById(String id);

    int updateById(ZhResource record);
}