package com.javatraing.conditions;

public class StaticEx {
	static int a;

	public static void main(String[] args) {
		a = 12;
		run();
	}

	static void run() {
		System.out.println("hello static");
	}
}
