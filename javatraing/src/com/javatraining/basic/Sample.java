package com.javatraining.basic;


class Animal
{
	String behaviour="eats meat";
	public Animal()
	{
		System.out.println("its default constructor!!!!!!!");
	}
	public Animal(String behaviour2)
	{
		System.out.println(behaviour2);
	}
	
}
class Dog extends Animal
{
	public Dog()
	{
		super("eats everything");
		System.out.println("its child constructor!!!!!!");
		System.out.println(super.behaviour);
	}
	String behaviour="eats veg";
	public void display()
	{

		System.out.println(super.behaviour);
		System.out.println(behaviour);
	}
	
}
public class Sample {
	public static void main(String[] args) {
		Dog obj=new Dog();
		
		obj.display();
	}

}
