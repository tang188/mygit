package com.huaweisoft.training.spring.core.di.none.spring;

public class Main {
    public static void main(String[] args){
	Foo foo1 = new Foo(new StringBuilder("f1 with StringBuilder"));
	foo1.printF1();
	
	foo1.setF1(new String("f1 with String"));
	foo1.printF1();
    }
}
