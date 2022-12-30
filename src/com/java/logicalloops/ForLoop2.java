package com.java.logicalloops;

public class ForLoop2{
	public static void main(String[] args) {
		
		int count=0;
		for (int i=100;i<=200;i++) {
			if(i%3==0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("count of numbers divisible by 3="+count);
	}
}





