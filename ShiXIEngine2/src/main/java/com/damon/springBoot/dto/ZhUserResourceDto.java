package com.damon.springBoot.dto;

import com.damon.springBoot.pojo.ZhResource;
import lombok.*;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ZhUserResourceDto {
    private String userId;

    private String resourceId;

    private Integer roleType;

    private Map<String, List<ZhResource>> resources;
}