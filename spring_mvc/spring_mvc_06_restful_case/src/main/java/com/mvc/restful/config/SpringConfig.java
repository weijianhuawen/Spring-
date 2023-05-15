package com.mvc.restful.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(value = "com.mvc.restful",
                excludeFilters = @ComponentScan.Filter(
                        type = FilterType.ANNOTATION,
                        classes = {Controller.class, Configuration.class}
                )
)
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}
