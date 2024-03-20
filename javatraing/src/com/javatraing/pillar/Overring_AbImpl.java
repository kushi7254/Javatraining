package com.javatraing.pillar;

public class Overring_AbImpl extends Method_overriding{//extends-inheritance 

	@Override//polymorphism
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("delete");
	}

	@Override
	public String modify() {
		// TODO Auto-generated method stub
		return "modify";
	}
public static void main(String[] args) {
	Overring_AbImpl or=new Overring_AbImpl();
	or.add(12, 0);
	or.delete();
	System.out.println(or.modify());
	or.get();
	
}

@Override
public void get() {
	// TODO Auto-generated method stub
	System.out.println("hi..");
}
}
