package com.vast.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan("com.vast.base.mappers")
public class VastBaseApplication  extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(VastBaseApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        // 注意这里要指向原先用main方法执行的Application启动类
//        return super.configure(builder);
        return application.sources(VastBaseApplication.class);
    }

}
