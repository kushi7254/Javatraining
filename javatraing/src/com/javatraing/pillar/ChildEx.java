package com.javatraing.pillar;

public class ChildEx extends ParentEx  {
public String car() {
	return "BMW";
}
public static void main(String[] args) {
	ChildEx c = new ChildEx();

	System.out.println(c.car());
	System.out.println(c.money());
	System.out.println(c.house());
	c.gold();
	c.land();
	
}
}
