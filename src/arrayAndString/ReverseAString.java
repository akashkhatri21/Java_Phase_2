package arrayAndString;

public class ReverseAString {

	public static void main(String[] args) {

		String atr = "How to reverse a string";

		String at = "Using";

		String[] arr = atr.split(" ");

		// System.out.println(arr[2]);

		// Below line will display the memory location of the array(where the array is
		// stored)
		// System.out.println(atr.split(""));

		for (int i = arr.length - 1; i >= 0; i--) {
			String a =arr[i];
			System.out.print(a);
			
		}
			System.out.println(atr.length());
			System.out.println(at.length());
			System.out.println(arr.length);
	}
	
	

		
}
