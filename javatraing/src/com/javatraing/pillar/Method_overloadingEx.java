package com.javatraing.pillar;

public class Method_overloadingEx {
	public static void main(String[] args) {
		Method_overloadingEx obj = new Method_overloadingEx();
		obj.run();
		obj.run(34);
		obj.run(78, 23);
	}

	// if we have multiple method with same name same return type and same access specifier but different in signature or in argument
	public void run(int a)// declaration
	{
		System.out.println("single argument");// body-implementation
	}

	public void run(int a, int b)// declaration
	{
		System.out.println("double argument");// body-implementation
	}

	public void run()// declaration
	{
		System.out.println("no argument");// body-implementation
	}
}
