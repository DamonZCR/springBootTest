package com.damon.springboot.pojo;

import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class Employee {
    private int id;
    private String name;
    private int age;
    private Date birthday;
    private BigDecimal salary;
}
