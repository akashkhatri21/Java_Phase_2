package arrayAndString;

public class StringMethods {

	public static void main(String[] args) {
		
		String a= "I am doing automation testing using java selenium";
		
		String ab[]= a.split(" ");
		
		//System.out.println(a.charAt(48));
	
	System.out.println(a.contains("b"));
	
		String L= a.concat(" with eclipse IDE");
		System.out.println(L);
		/*
		 * for(int i=0;i<ab.length;i++) { System.out.println(ab[i]); }
		 */

		
		for(int g=5;g>=0;g--)
		{
			for(int h=0;h<g;h++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
