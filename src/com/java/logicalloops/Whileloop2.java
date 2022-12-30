package com.java.logicalloops;

public class Whileloop2 {
	public static void main(String[] args) {
		int i=100;
		int count=0;
		while(i<=200) {
			if(i%3==0 && i%7==0) {
				System.out.println(i);
				count++;
			}
			i++;
		}
		System.out.println("count of numbers dividible by 3 and 7="+count);
	}

}
