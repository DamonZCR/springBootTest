package com.damon.springBoot.pojo;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ZhUserResource {
    private String userId;

    private String resourceId;

    private Integer roleType;
}