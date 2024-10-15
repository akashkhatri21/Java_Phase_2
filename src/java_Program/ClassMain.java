package java_Program;

public class ClassMain {

	public static void main(String[] args) {
			
		
		Class1 a= new Class1();
		
		a.etc();
		
		Class2 b= new Class2();
		b.cmd();
		b.nmd();

	}

}


 class Class1{
	 
	 public void etc()
	 {
		 
		 System.out.println("Calling method ETC");
		 
	 }
	 
	 public void mtc()
	 {
		 System.out.println("Calling method MTC"); 
		 
	 }
	 
	 public void ytc()
	 {
		 
		 System.out.println("Calling method YTC"); 
	 }
	
	
}
 
 class Class2{
	 
	 public void cmd()
	 {
		 
		 System.out.println("Calling method CMD");
	 }
	 
	 public void rmd()
	 {
		 System.out.println("Calling method RMD");
		 
	 }
	 
	 public void nmd()
	 {
		 System.out.println("Calling method NMD");
		 
	 }
	 
	 public void ymd()
	 {
		 System.out.println("Calling method YMD");
		 
	 }
	 
 }