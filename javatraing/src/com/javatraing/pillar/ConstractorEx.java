package com.javatraing.pillar;

public class ConstractorEx {
	// Contractor have same name as a class name, constructor is a special type of
	// method it is not accept any return type;
	// the main purpose of constructor to create object reference of a class

	public ConstractorEx() {
		System.out.println("default constructor");
	}

	public ConstractorEx(int a, int b) {
		System.out.println("parameterize constructor "+(a+b));
	}

	public static void main(String[] args) {
		ConstractorEx ce = new ConstractorEx(12, 34);
		ConstractorEx ce1 = new ConstractorEx();
		
	}
}
