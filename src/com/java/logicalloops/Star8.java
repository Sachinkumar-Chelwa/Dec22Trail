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
public class Star8 {
	public static void main(String[] args) {
		int rows=5;
		int stars=5;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		int rows1=4;
		int stars1=4;
		for(int k=1;k<=rows1;k++) {
			int temp=0;
			for(int a=stars1;a>=k;a--) {
				temp++;
				System.out.print(temp);
				
			}
			System.out.println();
		}
	}

}
