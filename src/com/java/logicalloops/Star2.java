package com.java.logicalloops;

public class Star2 {
	public static void main(String[] args) {
		int star=5;
		int rows=4;
//	for(int i=1;i<=rows;i++) {
		//	for(int j=1;j<=star;j++) {
			//	System.out.print(j);
//	}
	//		System.out.println();
	//	}
		int i=1;
		while(i<=rows) {
			i++;
			int j=1;
			while(j<=star) {
				j++;
				System.out.print("*");
				
			}
			System.out.println();
	
			
		}
		
	}

}
