package java_Program;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		
		AddTwoNumbers x= new AddTwoNumbers();
		
		
		x.Add();
		
		int w= x.ATM();
		
		System.out.println(w);
		
		
		

		
	}
	 void Add() {
		
		Scanner sc= new Scanner(System.in);
		
System.out.println("Enter two numbers: ");
		
		int a= sc.nextInt();
		
		int b= sc.nextInt();
		
		long c= a+b;
		System.out.println("Addition of two number is: "+ c);
	}
	
	public int ATM()
	{
		return 1000;
	}
}
