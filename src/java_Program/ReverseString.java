package java_Program;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Create a Scanner object to read input
       // Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
       // System.out.println("Enter a string: ");
    	String a="Enter a string: :";
        //String input = scanner.nextLine();
        
        // Reverse the string using a StringBuilder
        String reversed = new StringBuilder(a).reverse().toString();
        
        // Print the reversed string
        System.out.println("Reversed string: " + reversed);
        
        // Close the scanner
       // scanner.close();
    }
}
