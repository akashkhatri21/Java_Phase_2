package java_Program;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int a= sc.nextInt();
		
		long factorial=1;
		
		int b=1;
		
		
		
		
		  //int a=5; 
		  while(b<=a) {
			  factorial =factorial*b;
			  b++; 
		  }
			  
		  System.out.println("Factorial is " + factorial);
		 
	}
	

}
