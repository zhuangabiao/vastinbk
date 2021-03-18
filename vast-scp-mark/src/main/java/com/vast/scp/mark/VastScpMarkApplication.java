package com.vast.scp.mark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.vast.scp.mark.dao")
public class VastScpMarkApplication{

    public static void main(String[] args) {
        SpringApplication.run(VastScpMarkApplication.class, args);
    }
}
