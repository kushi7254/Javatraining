package com.javatraing.conditions;

public class ContractEx {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		// equals method s1 equals s3 == true so its mandatory hashcode method also be a
		// same hashcode
		// if two objects are equal to each other based on equals() method, then the
		// hash code must be the same,
		// but if the hash code is the same, then equals() can return false.
		//hash()-for decide index
	}
}
