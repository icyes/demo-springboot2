package com.example.demospringboot2.config;

import com.example.demospringboot2.bean.Pet;
import com.example.demospringboot2.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 告诉springboot这是一个配置类 == 配置文件
 * 1. 配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
 * 2. 配置类本身也是组件
 * 3.proxyBeanMethods: 代理bean的方法 是否开启代理
 * Full(proxyBeanMethods = true)
 * Lite(proxyBeanMethods = false)
 **/
@Configuration(proxyBeanMethods = true)
public class MyConfig {
    /**
     * 外部无论对配直类中的这个组件注册方法调用多少遍，都是之前注册到容器中的单实例对象
     */
    @Bean
    public static User zhangSan() {
        User user = new User("张三", 18);
        user.setPet(MyConfig.tomcatPet());
        return user;
    }
    
    @Bean("tom")
    public static Pet tomcatPet() {
        return new Pet("tomcat");
    }
}
