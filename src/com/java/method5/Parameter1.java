package com.java.method5;

public class Parameter1 {
	public void multiplication(int x, int y) {
		int mult=x*y;
		System.out.println(mult);
	}
	public static void main(String[] args) {
		Parameter1 object= new Parameter1();
		object.multiplication(20,50);
	}

}
