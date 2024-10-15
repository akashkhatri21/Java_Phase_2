package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		
			Set<Integer> se= new HashSet<Integer>();
			
			se.add(1);
			se.add(2);
			se.add(1);
			se.add(4);
			se.add(5);
			se.add(6);
			se.add(7);
			se.add(8);
			
		//	se.clear();
			System.out.println(se.size());
			//for each loop
		
		  for(int a:se) { System.out.println(a); }
		 
			
			//Iterating through Iterator
			
			Iterator<Integer> it= se.iterator();
			
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			

	}

}
