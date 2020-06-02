package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 *  @SpringBootApplication 来标注一个主方法，说明这是一个spring boot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {
        // spring应用起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
