package com.vast.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.vast.base.mapper")
@SpringBootApplication
public class VastBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(VastBaseApplication.class, args);
    }

}
