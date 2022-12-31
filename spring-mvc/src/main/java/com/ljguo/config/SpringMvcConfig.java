package com.ljguo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan("com.ljguo.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
