package com.damon.springBoot.service;

import com.damon.springBoot.dao.ZhResourceMapper;
import com.damon.springBoot.pojo.ZhResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ZhResourceServiceImpl implements ZhResourceService {
    @Autowired
    private ZhResourceMapper resourceMapper;

    @Override
    public int insert(ZhResource record) {
        return resourceMapper.insert(record);
    }

    @Override
    public int insertSelective(ZhResource record) {
        return resourceMapper.insertSelective(record);
    }

    @Override
    public List<ZhResource> selectAllResource() {
        return resourceMapper.selectAllResource();
    }

    @Override
    public List<ZhResource> selectAllResourceById(String id) {
        return resourceMapper.selectAllResourceById(id);
    }

    @Override
    public int deleteById(String id) {
        return resourceMapper.deleteById(id);
    }

    @Override
    public int updateById(ZhResource record) {
        return resourceMapper.updateById(record);
    }
}
