package java_Program;

public class PrivateMethodCalling {

	public static void main(String[] args) {
		
		
		Example obj = new Example();
		
		obj.TOCallPrivateMethod();
		String c= obj.GetPriavteVariable();
		System.out.println(c);

	}

}


class Example{
	
	
	private String b="Private vaibale calling";
	public void TOCallPrivateMethod()
	
	{
		
		PrivateMethod();
		System.out.println("This is a public method");
		//System.out.println(a);
	}
	
	private void PrivateMethod()
	
	{
		String a ="Private variable";
		System.out.println("This is a private method");
		System.out.println(a);
		
	}
	
	public String GetPriavteVariable() {
		//System.out.println(b);
		return b;
	}
	
	
}
