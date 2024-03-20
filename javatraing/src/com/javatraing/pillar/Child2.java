package com.javatraing.pillar;

public class Child2 extends ParentEx {
	public void car() {
		System.out.println("audi");
	}
	public static void main(String[] args) {
		Child2 c= new Child2();
		c.car();
		c.gold();
		System.out.println(c.house());
		System.out.println(c.money());

	}
}
