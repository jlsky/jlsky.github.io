package com.jili;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * ClassName: Application
 * Package com.jili
 * Description:
 *
 * @Author: 廖继礼
 * @Create: 2024/7/3
 * @Version: v1.0
 */
@SpringBootApplication
@MapperScan("com.jili.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
