package com.javatraing.conditions;

public class Student {
	public int sid;
	public String sName;

	public Student(int sid, String sName) {
		this.sid = sid;
		// sid=12;
		this.sName = sName;
		// sName=Amrutha;
	}

	public void display() {
		System.out.println("student ID " + sid + " student name " + sName);
	}

	public static void main(String[] args) {
		Student s = new Student(12, "Amrutha");
		s.display();
	}
}

