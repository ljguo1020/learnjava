package com.ljguo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.ljguo.controller","com.ljguo.config","com.ljguo.service","com.ljguo.mapper"})
@EnableWebMvc
public class SpringMvcConfig {

    @Bean
    public CommonsMultipartResolver multipartResolver(){
        CommonsMultipartResolver cmr = new CommonsMultipartResolver();
        cmr.setMaxUploadSize(51200000);
        cmr.setDefaultEncoding("utf-8");
        return cmr;
    }
}
