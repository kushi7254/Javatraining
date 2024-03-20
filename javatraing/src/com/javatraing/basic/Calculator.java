package com.javatraing.basic;

public class Calculator {
	public static void main(String[] args) {
		Calculator c = new Calculator();// creation of object reference
		c.sum(34, 45);
		c.sub(78, 67);
		c.multi(54, 6);
		c.div(5, 12);
	}

	public void sum(int a, int b) {
		System.out.println(a + b);
	}

	public void sub(int a, int b) {
		System.out.println(a - b);
	}

	public void multi(int a, int b) {
		System.out.println(a * b);
	}

	public void div(int a, int b) {
		System.out.println(a / b);
	}
}
