package com.huaweisoft.training.spring.core.di.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//表示此类是自动装配的候选类，容器管理其生命周期
//@Component
@Service
public class Foo {

    // 依赖注入CharSequence的实例
    // @Autowired
    private CharSequence f1;

    private CharSequence f2 = new String("f2");

    // 构造函数注入f1
    // @Autowired
    public Foo(CharSequence f1) {
        this.f1 = f1;
    }

    // setter方法注入f1
    @Autowired
    public void setF1(CharSequence f1) {
        this.f1 = f1;
    }

    public void printF1() {
        System.out.println("type:" + f1.getClass() + ", value:" + f1.toString());
    }
}
