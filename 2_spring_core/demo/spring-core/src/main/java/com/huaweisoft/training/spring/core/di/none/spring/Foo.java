package com.huaweisoft.training.spring.core.di.none.spring;

public class Foo {
    
    //
    private CharSequence f1;
    
    private CharSequence f2 = new String("f2");
    
    //构造函数注入f1
    public Foo(CharSequence f1){
	this.f1= f1;
    }
    
    //setter方法注入f1
    public void setF1(CharSequence f1){
	this.f1 = f1;
    }
    
    public void printF1(){
	System.out.println("type:"+f1.getClass()+", value:"+f1.toString());
    }
}
