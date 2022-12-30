package com.java.logicalloops;
//*
//**
//***
//****
//*****
//****
//***
//**
//*
public class Star7 {
	public static void main(String[] args) {
		int rows=5;
		int stars=5;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int row1=4;
		int star1=4;
		for(int k=1;k<=row1;k++) {
			for(int s=star1;s>=k;s--) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	
	
}


