package com.halcyon.ainocodebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.halcyon.ainocodebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class AiNoCodeBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiNoCodeBackendApplication.class, args);
    }

}
