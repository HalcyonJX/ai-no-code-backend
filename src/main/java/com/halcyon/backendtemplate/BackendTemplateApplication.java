package com.halcyon.backendtemplate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.halcyon.backendtemplate.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class BackendTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendTemplateApplication.class, args);
    }

}
