package com.carl.study.springboot.service.impl;

import com.carl.study.springboot.model.Student;
import com.carl.study.springboot.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @Desc 学生类业务操作
 * @Author changez
 * @Time 2018/11/7 9:31
 */
@Service
public class StudentServiceImpl implements StudentService {

  @Override
  public void changeAge(Student stu) {
    stu.setId(new Random().nextInt(100));
  }
}
