package com.baomidou.samples.mybatisplus2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.baomidou.dynamic.datasource","com.baomidou.samples.mybatisplus2"})
@MapperScan("com.baomidou.samples.mybatisplus2.mapper")
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}