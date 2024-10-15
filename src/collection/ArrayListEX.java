package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayListEX {

	public static void main(String[] args) {
			
		
		
			List<String> li=new ArrayList();
			
			li.add("Aryan");
			li.add("Kiran");
			li.add("Sumit");
			li.add("Amit");
			li.add("Aman");
			li.add("Rahul");
			
			System.out.println(li);
			
			System.out.println(li.get(5));
			
			for(String a:li)
			{
				System.out.println(a);
			}
			
			li.set(3, "Yuvraj");
			
			for(String a:li)
			{
				System.out.println(a);
			}
			
			/*for(String b:li) {
			System.out.println(Collections.sort(li));
			}
			
			}*/
	}}
