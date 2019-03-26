package com.lx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 标注一个主程序说明这是一个Spring boot应用
 */
@SpringBootApplication
public class HelloWorldMAinApplication {

    public static void main(String[] args) {

        //Spring应用启动
        SpringApplication.run(HelloWorldMAinApplication.class,args);
    }
}
