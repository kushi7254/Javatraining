package com.javatraing.conditions;

public class ThisEx2 {
	public ThisEx2() {//2
		this(2,4);//3
		System.out.println("default constructor");//9
	}

	public ThisEx2(int a, int b) {//4
		this(2,4,5);//5
		System.out.println("2parameterised constructor");//8
	}

	public ThisEx2(int a, int b, int c) {//6
		System.out.println("3parameterised constructor");//7
	}

	public static void main(String[] args) {
		ThisEx2 th = new ThisEx2();//1
	}
}
