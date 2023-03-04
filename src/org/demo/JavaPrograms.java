package org.demo;

import java.util.Scanner;

public class JavaPrograms {
	
	
	
	public static void main(String[] args) {
		
		int a,b,c;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	
	
	
a=	sc.nextInt();
b= sc.nextInt();
c=a;
a=b;
b=a;
b=c;
System.out.println("checking swaping");
System.out.println(a);
System.out.println(b);


	
	}
	
	
}


