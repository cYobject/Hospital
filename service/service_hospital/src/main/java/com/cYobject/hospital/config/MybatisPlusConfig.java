package com.cYobject.hospital.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.cYobject.hospital.mapper")
public class MybatisPlusConfig {
}
