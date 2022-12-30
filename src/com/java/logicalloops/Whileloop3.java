package com.java.logicalloops;
import java.util.Scanner;
public class Whileloop3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the numbers");
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		int count=0;
		int i=a;
		while(i<=b) {
			if(i%3==0 && i%7==0) {
				System.out.println(i);
				count++;
				
			}
			
			i++;
			
			
		}
		System.out.println("count of numbers divisible by 3&7="+count);
	}

}
