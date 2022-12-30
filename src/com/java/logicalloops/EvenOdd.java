package com.java.logicalloops;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int a=scan.nextInt();
		if (a%2!=0) {
			System.out.println("the given number is odd");
		}
		else {
			System.out.println("the given number is even");
		}
	}

}
