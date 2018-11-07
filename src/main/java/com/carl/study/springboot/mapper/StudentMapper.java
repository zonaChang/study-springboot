package com.carl.study.springboot.mapper;

import com.carl.study.springboot.model.Student;
import org.apache.ibatis.annotations.Param;

import java.util.Set;

/**
 * @Desc: 学生类数据库操作
 * @Auth: changez
 * @Time: 2018/11/7 14:24
 */
public interface StudentMapper {


  /**
   * @desc 查询学生属性
   * @author changez@thinkive.com
   * @time 2018年9月12日 下午3:23:39
   * @param id
   * @return
   */
  Student queryStudentById(Integer id);

  /**
   * @desc 查询学生及其班级属性 一对一
   * @author changez@thinkive.com
   * @time 2018年9月12日 下午3:23:50
   * @param id
   * @return
   */
  Student queryStudentAndClazzById(Integer id);

  /**
   * @desc 查询学生及其班级,教师属性 一对一， 一对多
   * @author changez@thinkive.com
   * @time 2018年9月12日 下午5:16:57
   * @param id
   * @return
   */
  Student queryStudentAndTeacherAndClassById(Integer id);

  /**
   * @desc 查询所有学生
   * @author changez@thinkive.com
   * @time 2018年9月12日 下午5:17:07
   * @return
   */
  Set<Student> queryAllStudent();


  int updateStudentById(@Param("name") String name, @Param("id") int id);
}
