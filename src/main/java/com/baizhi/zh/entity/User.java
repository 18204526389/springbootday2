package com.baizhi.zh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id   //主键标识
    private Integer id;
    private String name;
    private String password;
    private Integer salary;
    private Integer age;
}
