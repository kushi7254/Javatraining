package com.javatraing.conditions;

public class FinalEx {
  int a = 30;

	public static void main(String[] args) {

		FinalEx fe = new FinalEx();
		fe.sum();
	}

	public void sum() {
		a = 65;
		int b = 45;
		System.out.println(a + b);
	}
}

//final keyword:use to provide restrictions.
//variable:if you use final keyword with a variable we can not change the value of that variable value in entire code it behaves like constant
//method:if we use final keyword with method we can not override that method
//class: if we use final keyword with class we can not extends the property of that particular class
