package java_Program;

import java.util.Scanner;

public class ReverseStringWithOld {

	

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		 
		System.out.println("Enter the String: ");
		
		String a = sc.nextLine();
		
		String reverse= "";
		
		for (int j= a.length() -1;j >= 0; j--)
		
		{
			reverse =reverse+ a.charAt(j);  // Append each character to the reversed string
        
			 
		}
			System.out.println("Reversed String: " +reverse);
	}}