package java_Program;

class AccessModifier1 extends Class8{
	
	
	 AccessModifier1()
	{
		 System.out.println("Consturctor is createdX");
	}

	public static void main(String[] args) {
		
		AccessModifier1 a= new AccessModifier1();
		Class8 n= new Class8();
		
		 
		
		n.Method2();
		
		a.Method2();
		
		a.Method1();

	}
	
	public void Method2(){
		
		
		System.out.println("Method 2 public");	
		}
	
	
	
	
	

}

 class Class8{
	 
	
	 
	 
	 protected void Method1(){
			
			
			System.out.println("Method 1 private ");	
			}
	 
	
	 public void Method2(){
			
			
			System.out.println("Method 1 public");	
			}
	
}
