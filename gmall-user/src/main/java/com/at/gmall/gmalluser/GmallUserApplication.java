package com.at.gmall.gmalluser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


//@MapperScan(basePackages = "com.at.gmall.gmalluser.mapper" )
@MapperScan(basePackages = "com.at.gmall.gmalluser.mapper" )
@SpringBootApplication
public class GmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserApplication.class, args);
    }

}
