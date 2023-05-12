package com.mvc.demo.config;

import com.sun.org.apache.xml.internal.utils.PrefixResolver;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.Property;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.mvc.demo.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
