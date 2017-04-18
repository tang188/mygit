package com.huaweisoft.training.spring.core.di.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    
    public static void main(String[] args) {
	// 初始化stand alone spring容器，指定自动装配扫描范围， 也可以精确指定扫描哪些类
	//ApplicationContext ctx = new AnnotationConfigApplicationContext(MyServiceImpl.class, Dependency1.class, Dependency2.class);
	// 对象之间的依赖通过容器注入
	try (AnnotationConfigApplicationContext context = 
		new AnnotationConfigApplicationContext("com.huaweisoft.training.spring.core.di.spring")) {
	    //获取Foo的对象
	    Foo foo = context.getBean(Foo.class);
	    
	    //打印foo的f1属性的类型和值
	    foo.printF1();
	}
    }
}
