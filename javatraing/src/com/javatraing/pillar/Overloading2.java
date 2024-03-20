package com.javatraing.pillar;

public class Overloading2 {
	public static void main(String[] args) {
		Overloading2 obj = new Overloading2();
		obj.add(23,45);
		obj.add(34,56,34);
		obj.add(78, 23,67,29);
	}

	// if we have multiple method with same name same return type and same access
	// specifier but different in signature or in argument
	public void add(int a,int b)// declaration
	{
		System.out.println("two argument " + (a + b));// body-implementation
	}

	public void add(int a, int b,int c)// declaration
	{
		System.out.println("three argument "+ (a + b+c));// body-implementation
	}

	public void add(int a, int b,int c,int d)// declaration
	{
		System.out.println("four argument "+(a + b+c+d));// body-implementation
	}
}
