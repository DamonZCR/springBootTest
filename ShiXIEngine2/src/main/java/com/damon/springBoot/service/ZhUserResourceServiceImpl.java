package com.damon.springBoot.service;

import com.damon.springBoot.dao.ZhResourceMapper;
import com.damon.springBoot.dao.ZhUserResourceMapper;
import com.damon.springBoot.dto.ZhUserResourceDto;
import com.damon.springBoot.pojo.ZhResource;
import com.damon.springBoot.pojo.ZhUserResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ZhUserResourceServiceImpl implements ZhUserResourceService {
    @Autowired
    private ZhUserResourceMapper userResourceMapper;
    @Autowired
    private ZhResourceMapper resourceMapper;

    @Override
    public int insertUserResource(ZhUserResource record) {
        return userResourceMapper.insertUserResource(record);
    }
    @Override
    public int insertSelective(ZhUserResource record) {
        return userResourceMapper.insertSelective(record);
    }
    @Override
    public List<ZhUserResource> selectAllUserResource() {
        return userResourceMapper.selectAllUserResource();
    }
    @Override
    public List<ZhUserResource> selectUserResourceById(String id) {
        return userResourceMapper.selectUserResourceById(id);
    }

    // 通过用户Id,查询用户所属的各个RoleType对应的Resource
    @Override
    public ZhUserResourceDto selectResourceByUserIdAndType(String id) {
        Map<String, List<ZhResource>> res = new HashMap<>(3);
        List<ZhUserResource> list = userResourceMapper.selectUserResourceById(id);

        for (ZhUserResource ur : list){
            List<ZhResource> resources = res.getOrDefault(ur.getRoleType().toString(), null);
            if (resources == null) {
                resources = new ArrayList<>();
                res.put(ur.getRoleType().toString(), resources);
            }
            resources.addAll(resourceMapper.selectAllResourceById(ur.getResourceId()));
        }
        ZhUserResourceDto urRes = new ZhUserResourceDto();
        urRes.setUserId(id);
        urRes.setResources(res);
        return urRes;
    }

    @Override
    public List<ZhResource> selectResourceByUserId(String id) {
        return userResourceMapper.selectResourceByUserId(id);
    }

    @Override
    public int deleteUserResourceById(String id){
        return userResourceMapper.deleteUserResourceById(id);
    }

    @Override
    public int updateUserResourceById(ZhUserResource record) {
        return 0;
    }
}
