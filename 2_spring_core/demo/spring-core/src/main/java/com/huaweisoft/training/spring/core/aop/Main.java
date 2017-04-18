package com.huaweisoft.training.spring.core.aop;

import java.math.BigDecimal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
	try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
		"com.huaweisoft.training.spring.core.aop")) {
	    // 获取MajorConcern的对象
	    MajorConcern mc = context.getBean(MajorConcern.class);

	    BigDecimal p1 = BigDecimal.valueOf(111.234);
	    BigDecimal p2 = BigDecimal.valueOf(1000);
	    System.out.println(mc.add(p1, p2));

	    System.out.println(mc.addAop(p1, p2));
	}
    }
}
