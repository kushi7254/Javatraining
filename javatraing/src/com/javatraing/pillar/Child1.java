package com.javatraing.pillar;

public class Child1 extends ParentEx {
public void bike() {
	System.out.println("R15");
}
public static void main(String[] args) {
	Child1 c= new Child1();
	c.bike();
	c.gold();
	System.out.println(c.house());
	System.out.println(c.money());

}
}
