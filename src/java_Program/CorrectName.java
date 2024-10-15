package java_Program;

public class CorrectName {
	
	
    public static void main(String[] args) {
        // Input string
        String input = "My Name is Akash My name is Akash My name is Akash Akash Akash Akash My Name is Suraj";

        // Define the correct phrase to search
        String correctPhrase = "Akash";

        // Split the input string into words
        String[] words = input.split(correctPhrase);

        // Count occurrences of the correct phrase
        int correctOccurrences = words.length-1;

        // Output the result
        System.out.println("Correct Name occurrences is " + correctOccurrences);
    }
}
