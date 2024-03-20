package com.javatraining.basic;
class Emp
{
	static String name="deepa";//static variable
	
	 int empid=108227;//global or instance variable
	double sal=300000;
	
	public void display()//declaration of method
	{
		System.out.println(name+" "+empid+" "+sal);//implementation of method
	
	}
	public void add(int a,int b)//local variables
	{
		System.out.println(a+b);
	}
	public static void show()
	{
		System.out.println("in show");
	}
	
	}
public class Basics {
	int z=20;//global variable
	public static void main(String[] args) {
		int x=30;//local variable
		System.out.println(x);//local variable
		System.out.println(Emp.name);
		
		Basics obj1=new Basics();
		System.out.println(obj1.z);
		Emp obj=new Emp();
		System.out.println(obj.empid);
		System.out.println(obj.sal);
		obj.display();
		obj.add(10, 20);
		Basics();
		Emp.show();
		
	}
	 private static void Basics() {
		// TODO Auto-generated method stub
		
	}
	public Basics()
	{
		System.out.println("hriii");
	}
	
	

}
