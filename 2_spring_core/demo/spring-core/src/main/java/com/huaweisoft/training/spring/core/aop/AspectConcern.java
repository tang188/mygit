package com.huaweisoft.training.spring.core.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectConcern {
    
    //切点定义此方法（advice）将在何时被应用到那些主要关注点（业务类的方法，即连接点），spring只支持方法级别的连接点
    //切点（切点表达式）
    @Before("execution (* com.huaweisoft.training.spring.core.aop.*.*(..))")
    public void logParams(JoinPoint point){
	
	//连接点所在的类名、连接点方法
	String fullJoinPointMethod = point.getSignature().getDeclaringTypeName()+point.getSignature().getName();
	
	System.out.println("Execution PointCut: call "+fullJoinPointMethod+","+Arrays.toString(point.getArgs()));
    }
    
    @Before("@annotation(com.huaweisoft.training.spring.core.aop.LogRequired)")
    public void logParamsByAnnotation(JoinPoint point){
	
	//连接点所在的类名、连接点方法
	String fullJoinPointMethod = point.getSignature().getDeclaringTypeName()+point.getSignature().getName();
	
	System.out.println("Annotation PointCut: call "+fullJoinPointMethod+","+Arrays.toString(point.getArgs()));
    }
}
