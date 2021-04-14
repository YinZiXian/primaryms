package com.yinzx.conf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan("com.yinzx.mapper")
public class MyBatisConfig {

}
