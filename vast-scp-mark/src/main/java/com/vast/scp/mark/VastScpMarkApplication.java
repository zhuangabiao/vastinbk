package com.vast.scp.mark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.vast.scp.mark.dao")
public class VastScpMarkApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(VastScpMarkApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(VastScpMarkApplication.class);
    }
}
