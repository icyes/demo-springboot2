package com.example.demospringboot2;

import com.example.demospringboot2.bean.Pet;
import com.example.demospringboot2.bean.User;
import com.example.demospringboot2.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoSpringBoot2Application {
    
    public static void main(final String[] args) {
        // 1.返回我们IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(DemoSpringBoot2Application.class, args);
        
        //		2.查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        for (final String name : names) {
            System.out.println(name);
        }
        
        //    从容器中获取组件
        Pet tom01 = run.getBean("tom", Pet.class);
        Pet tom = run.getBean("tom", Pet.class);
        System.out.println("组件：" + (tom01 == tom));
        
        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean);
        
        User user1 = MyConfig.zhangSan();
        User user2 = MyConfig.zhangSan();
        System.out.println(user1 == user2);
        
        User user01 = run.getBean("user01", User.class);
        Pet tom1 = run.getBean("tom", Pet.class);
        System.out.println("tom1:" + (user01.getPet() == tom1));
    }
}
