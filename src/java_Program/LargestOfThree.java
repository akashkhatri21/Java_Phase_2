package java_Program;

public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 60;
		int b= 30;
		int c= 30;
		
		if(a>=b && a>=c)
		{
			System.out.println("a is greater among all");
		}
		
		else if(b>=a && b>=c)
		{
			System.out.println("b is greater among all");
		}
		
		else 
			//if(c>=a && c>=b)
		{
			System.out.println("c is greater among all");
		}
	}

}
