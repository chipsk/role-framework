package com.library.admin;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.library.common.mapper")
@EnableScheduling
public class LibraryAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(LibraryAdminApplication.class,args);
    }
}
