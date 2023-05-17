package com.mvc.interceptor.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(value = "com.mvc.interceptor.config", excludeFilters = {
        @ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                classes = {Controller.class, Configuration.class}
        )
})
public class SpringConfig {
}
