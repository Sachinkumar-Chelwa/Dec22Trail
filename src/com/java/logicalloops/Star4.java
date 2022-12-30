
package com.java.logicalloops;

public class Star4 {
	public static void main(String[] args) {
		int rows=5;
		int stars=5;
	//	for(int i=1;i<=rows;i++) {
	//		for(int j=stars;j>=i;j--) {
	//			System.out.print("*");
				
	//		}
	//		System.out.println();
	//	}
		int i=1;
		while(i<=rows) {
			int j=stars;
			while(j>=i) {
			
				System.out.print("*");
				j--;
			}
			
			System.out.println();
			i++;
		}
	}

}
