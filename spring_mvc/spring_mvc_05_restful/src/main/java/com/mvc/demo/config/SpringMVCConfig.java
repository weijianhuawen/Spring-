package com.mvc.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.mvc.demo.controller")
@EnableWebMvc
public class SpringMVCConfig {
}
