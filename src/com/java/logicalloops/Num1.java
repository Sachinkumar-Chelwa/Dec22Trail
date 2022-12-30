package com.java.logicalloops;

public class Num1 {
public static void main(String[] args) {
	int rows=5;
	int num=5;
	int space=4;
	//for (int i=1;i<=rows;i++) {
	//	for(int j=space;j>=i;j--) {
	//		System.out.print(" ");
	//	}
	//	for(int k=1;k<=i;k++) {
	//		System.out.print("1 ");
	//	}
	//	System.out.println();
//	}
	int i=1;
	while(i<=rows) {
		int j=space;
		while(j>=i) {
			System.out.print(" ");
			j--;
			
		}
		int k=1;
				while(k<=i) {
					System.out.print("1 ");
					k++;
				}
		System.out.println();
		i++;
		
	}
	
}
}
