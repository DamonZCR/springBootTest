package com.damon.springBoot.pojo;

import lombok.*;

@Getter
@Setter@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ZhResource {
    private Integer type;

    private String id;

    private String name;

    private String menuPath;

    private String servicePath;

    private String dataPath;

    private Integer dataType;

    private String table;

    private String column;

    private String proto;

    private String ip;

    private String port;

    private String appPro;

    private String auth;

    private String editTime;
}