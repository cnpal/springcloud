package com.pal.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author pal
 * @Date Created in 2020/7/8 14:27
 * @Version: 1.0
 */
@Configuration
@MapperScan("com.pal.springcloud.dao")
public class MyBatisConfig {
}
