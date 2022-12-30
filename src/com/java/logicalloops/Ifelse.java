package com.java.logicalloops;
import java.util.Scanner;
public class Ifelse {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the numbers");
		int a=scan.nextInt();
		if (a%2==0) {
			System.out.println("given number is even");
		}
		else {
			System.out.println("given number is odd");
		}
	}

}
