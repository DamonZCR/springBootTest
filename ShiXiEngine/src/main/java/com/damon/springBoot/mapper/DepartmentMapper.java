package com.damon.springBoot.mapper;

import com.damon.springBoot.dto.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DepartmentMapper {
    //获得所有部门信息
    List<Department> getAll();

    //通过ID的到部门
    int getIdByDname(@Param("dname") String dname);
}
