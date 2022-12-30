package com.java.logicalloops;

public class Num3 {
	public static void main(String[] args) {
		int rows=5;
		int num=5;
		int space=4;
		for(int i=1;i<=rows;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(" ");
				
			}
			for (int k=num;k>=i;k--) {
				System.out.print("1 ");
			}
			System.out.println();
			
		}
		
	}

}
