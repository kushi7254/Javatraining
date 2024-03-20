package com.javatraing.conditions;

public class ThisEx {
	public void method1() {
		System.out.println("this is method1");
	}

	public void method2() {
		this.method1();
		System.out.println("this is method2");
	}
	public static void main(String[] args) {
		ThisEx th=new ThisEx();
		th.method2();
	}
}
