package com.java.variable;

public class VariableTypes {
	int a=10;
	 int c=10;
	 int b=25;
	public void addition() {
		int b=30;
		int a=15;
	
		System.out.println(this.a);
		System.out.println(b);
		
		}
	public void multiplication() {
		int b=10;
		System.out.println(this.b);
		
		
	}
public static void main(String[] args) {
	
	 VariableTypes object=new  VariableTypes();
	 object.addition();
	 object.multiplication();
	 System.out.println(object.c);
}
}
