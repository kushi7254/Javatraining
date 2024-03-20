package com.javatraing.conditions;

class Animal {
	int a = 1;
	String name = "super";

	public Animal() {
		System.out.println("this is super class constructor");
	}

	public Animal(int a, int b) {
		System.out.println("this is parameterised constructor");
	}
}

class Dog extends Animal {
	String name = "dog";

	public Dog() {
		super(12,34);
		System.out.println("this is child constructor");
	}

	void display() {
		System.out.println(super.name);
	}
}

public class SuperEx {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.display();
	}
}
