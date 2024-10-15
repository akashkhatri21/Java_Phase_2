package java_Program;

public class Construtor {

	public static void main(String[] args) {

		Construtor c= new Construtor(1,2); 
		
		c.Met();
		
		

	}

	
	public Construtor(int a, int b) {
		
		System.out.println("I am calling a Construtor");
		System.out.println(a+" "  +b);
	}
	
public int Met() {
		
		System.out.println("I am calling a method");
		 
		System.out.println();
		//System.out.println(return);
		return 12;
		
	}
}
