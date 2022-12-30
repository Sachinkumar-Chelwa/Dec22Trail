package com.java.logicalloops;
import java.util.Scanner;
public class IfElseif {
public static void main(String[] args) {
	Scanner object=new Scanner(System.in);
	System.out.println("enter the marks");
	int obtainedmarks=object.nextInt();
	if(obtainedmarks>80) {
		System.out.println("candidate passed in first class");
	}
	else if(obtainedmarks>60 && obtainedmarks<=80) {
		System.out.println("candidate passed in second class ");
	}
	else if(obtainedmarks>35 && obtainedmarks<=60) {
		System.out.println("candidate is passed in third class");
		
	}
	else if(obtainedmarks<35) {
		System.out.println("candidate is fail");
	}
}
}
