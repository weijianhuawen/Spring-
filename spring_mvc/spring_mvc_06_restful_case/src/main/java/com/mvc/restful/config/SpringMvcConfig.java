package com.mvc.restful.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.mvc.restful.controller", "com.mvc.restful.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
