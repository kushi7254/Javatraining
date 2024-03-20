package com.javatraing.pillar;

public class AbstractExImpl extends AbstractEx {

	@Override
	public void add_customer(int a) {
		// TODO Auto-generated method stub
		System.out.println("customer added");
	}

	@Override
	public void delete_customer() {
		// TODO Auto-generated method stub
		System.out.println("customer deleted");
	}
public static void main(String[] args) {
	AbstractExImpl ab= new AbstractExImpl();
	ab.add_customer(12);
	ab.delete_customer();
}
}
