package com.javatraing.basic;

import java.util.Scanner;

public class Form_creation {
public static void main(String[] args) {
	Form_creation fc= new Form_creation();
	Scanner sc= new Scanner(System.in);
	System.out.println("enter your name:");
	String name=sc.nextLine();
	System.out.println("enter your email:");
	String email=sc.nextLine();
	System.out.println("how old are you?");
	int age=sc.nextInt();
	fc.userName(name);
	fc.emailId(email);
	fc.age(age);
}
public void userName(String name) {
	System.out.println("my name is "+ name);
}
public void emailId(String email) {
	System.out.println("my emailId  "+ email);
}
public void age(int age) {
	System.out.println("I'm "+ age + " years old");
}
}