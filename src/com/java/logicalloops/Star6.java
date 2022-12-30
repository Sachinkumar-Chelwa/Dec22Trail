package com.java.logicalloops;
//    *
//   **
//  ***
// ****
//*****
// ****
//  ***
//   **
//    *
public class Star6 {
public static void main(String[] args) {
	int rows=5; int stars=5; int space=4;
	for(int i=1;i<=rows;i++) {
		for(int j=space;j>=i;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print("*");
		}
		System.out.println();
	}
	int rows1=4,star1=4,space1=4;
	for(int a=1;a<=rows1;a++) {
		
		for(int b=1;b<=a;b++) {
			
			System.out.print(" ");
		}
		for(int c=star1;c>=a;c--) {
			
			System.out.print("*");
		}
		System.out.println();
	}
}
}
