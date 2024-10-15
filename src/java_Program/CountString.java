package java_Program;

import java.util.Map;
import java.util.HashMap;

public class CountString {

	public static void main(String[] args) {
		
	
		        String input = "my is akash"; // The given string
		        Map<Character, Integer> charCountMap = new HashMap<>();

		        // Iterate through each character in the string
		        for (char currentChar : input.toCharArray()) {
		            // Increment the count for this character
		            charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);
		        }

		        // Output the character counts
		        System.out.println("Character counts in the string \"" + input + "\":");
		        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
		            System.out.println(entry.getKey() + ": " + entry.getValue());
		        }
		    }
		}

	


