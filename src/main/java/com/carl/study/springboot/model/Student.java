package com.carl.study.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Desc 学生类实体
 * @Author changez
 * @Time 2018/11/7 9:19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

  private long id;
  private String name;
}
