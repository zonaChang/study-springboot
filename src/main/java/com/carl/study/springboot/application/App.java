package com.carl.study.springboot.application;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Desc 根
 * @Author changez
 * @Time 2018/11/7 8:49
 */
@SpringBootApplication
@ComponentScan({"com.carl.study.springboot.controller", "com.carl.study.springboot.service.impl"})
@MapperScan("com.carl.study.springboot.mapper")
@Slf4j
public class App {

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
//    System.out.println("app is running...");
    log.info("app is running...");
  }

}
