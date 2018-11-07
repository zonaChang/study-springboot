package com.carl.study.springboot.controller;

import com.carl.study.springboot.mapper.StudentMapper;
import com.carl.study.springboot.model.Student;
import com.carl.study.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc 学生类控制器
 * @Author changez
 * @Time 2018/11/7 8:48
 */
@RestController
@RequestMapping("/boot/api/student/")
public class StudentController {

  @Autowired
  private StudentService studentService;

  @Autowired
  private StudentMapper studentMapper;


  @RequestMapping("getStuByName")
  public Student getStuByName(String name){

    Student student = new Student(34, "name-" + name);
    studentService.changeAge(student);
    return student;
  }

  @RequestMapping("getStuByDB")
  public  Student getStuByDB(int stuId){

    return studentMapper.queryStudentById(stuId);
  }

  @RequestMapping("updateNameById")
//  @Transactional
  public  int updateNameById(String name, int id){

    int result = studentMapper.updateStudentById(name, id);
    if (id == 2) {

      int x = 2/0;
    }
    return result;
  }
}
