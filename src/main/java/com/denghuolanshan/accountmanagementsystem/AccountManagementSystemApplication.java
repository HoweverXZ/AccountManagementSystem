package com.denghuolanshan.accountmanagementsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@MapperScan("com.denghuolanshan.accountmanagementsystem.purchase.mapper")
public class AccountManagementSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountManagementSystemApplication.class, args);
    }
}
