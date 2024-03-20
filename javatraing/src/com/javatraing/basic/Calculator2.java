package com.javatraing.basic;

import java.util.Scanner;

public class Calculator2 {
	public static void main(String[] args) {
		Calculator2 c = new Calculator2();// creation of object reference
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the two values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		c.sum(a, b);
		c.sub(d,e);
		c.multi(a, b);
		c.div(a, b);
	}

	public void sum(int a, int b) {
		System.out.println(a + b);
	}

	public void sub(int d, int e) {
		System.out.println(d - e);
	}

	public void multi(int a, int b) {
		System.out.println(a * b);
	}

	public void div(int a, int b) {
		System.out.println(a / b);
	}

}
