package com.huaweisoft.training.spring.core.di.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//配置类
//Configuration表明此类中有@Bean标注的对象需要被初始化
//依赖注入的注解@Autowired或@Inject依赖的对象就是这些@Bean初始化的对象
@Configuration
public class AppConfiguration {
    //@Bean
    //配置一个String类型的实例，通过接口类型注入
    public String initStringF1(){
	return "f1 inited by Bar @Configuration";
    }
    
    @Bean
    public StringBuilder initStringBuilderF1(){
	return new StringBuilder("f1 inited by Bar @Configuration");
    }
    
}
