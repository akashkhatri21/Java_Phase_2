package arrayAndString;

public class ReverseString {

	public static void main(String[] args) {
		String  a= "Akash khatri is my name";
		
		String ab[]= a.split(" "); 
		
		for(int j=0;j<ab.length;j++)
		{
			System.out.println(ab[j]+" ");
		}
		
		
		  System.out.println();
		  
		  System.out.println(a.toUpperCase());
		  
		  System.out.println(a.toLowerCase());
		  
		  System.out.println(a.replaceAll("Akash khatri is my name"
		  ,"My name is Akash Khatri"));
		  
		  System.out.println(a.replace("is my name","My name is Akash Khatri"));
		  
		  System.out.println(a.trim());
		  
		  
		  for(int i =ab.length-1;i>=0;i--) {
		  
		  System.out.print(ab[i]+" ");
		  
		  }
		 		
		
		
		

	}

}
