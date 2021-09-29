package com.example.demospringboot2.config;

import com.example.demospringboot2.bean.Pet;
import com.example.demospringboot2.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
@Configuration // 告诉springboot这是一个配置类 == 配置文件
public class MyConfig {

    @Bean
    public User zhangSan(){
        return new User("张三",18);
    }

    public Pet tomcatPet(){
        return new Pet("tomcat");
    }
}
