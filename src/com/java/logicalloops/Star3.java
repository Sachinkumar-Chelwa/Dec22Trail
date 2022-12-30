package com.java.logicalloops;

public class Star3 {
	public static void main(String[] args) {
		int rows=5;
		int star=5;
	//	for (int i=1;i<=rows;i++) {
	//		for(int j=1;j<=i;j++) {
	//			System.out.print("* ");
//			}
//			System.out.println();
//		}
		int i=1;
		while(i<=rows) {
			
			int j=1;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
				
			System.out.println();
			i++;
					
			
		}
		
	}

}
