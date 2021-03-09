package com.vast.base.config;

import com.vast.base.VastBaseApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

/**
 * ====================================================
 *
 * @ProjectName: vastinbk
 * @Package: com.vast.base.config
 * @ClassName: ServletInitializer
 * @Author: Administrator
 * @Description:
 * @Date: 2021/3/5 9:25
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
//@Configuration
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(VastBaseApplication.class);
    }
}
