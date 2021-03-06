package com.kkrepo.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author WangRuofei
 * @create 2020-11-23 20:38 下午
 * @copyright (c) 2020, kkrepo.com All Rights Reserved
 */
@EnableAsync
@EnableScheduling
@SpringBootApplication
@MapperScan("com.kkrepo.blog.repository")
public class BlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

}

