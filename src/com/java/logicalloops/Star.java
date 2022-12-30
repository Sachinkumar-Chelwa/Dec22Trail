package com.java.logicalloops;

public class Star {
	public static void main(String[] args) {
		int rows=5;
		
		int space=4;
		for(int i=1;i<=rows;i++) {
			for(int j=space;j>=i;j--) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		
		}
		
	}

}
