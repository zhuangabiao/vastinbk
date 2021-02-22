package com.vast.base.config;

import com.vast.base.interceptor.AdminInterceptor;
import com.vast.base.units.SystemFinal;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.*;

import java.time.LocalDate;
import java.util.List;

/**
 * ====================================================
 *
 * @ProjectName: vast-inbk
 * @Package: com.vast.base.config
 * @ClassName: LoginConfig
 * @Author: Administrator
 * @Description: 拦截器配置
 * @Date: 2021/1/5 15:19
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
//@Configuration
public class LoginConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册TestInterceptor拦截器
        InterceptorRegistration registration = registry.addInterceptor(new AdminInterceptor());
        registration.addPathPatterns("/**");                      //所有路径都被拦截
        registration.excludePathPatterns(                         //添加不拦截路径
                SystemFinal.URI_LOGIN_PAGE,   //登录页面
                SystemFinal.URI_LOGIN,   //登录
                "/static/**",            //html静态资源
                "/vast/verifyCode*",     //验证码
                "*.jpeg",
                "*.jpg",
                "*.woff",
                "*.ttf",
                "*.css",
                "*.js",
                "*.json"
        );
    }
}
