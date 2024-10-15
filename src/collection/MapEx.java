package collection;

import java.util.Map;
import java.util.HashMap;

public class MapEx {

	public static void main(String[] args) {

		Map<String, Integer> ma = new HashMap<String, Integer>();

		ma.put("Akash", 1);
		ma.put("Rahul", 2);
		ma.put("Suraj", 3);
		ma.put("Pooja", 4);
		ma.put("Soniya", 5);
		ma.put("Sonu", 6);
		ma.put("Aryan", 1);

		System.out.println(ma.keySet());
		System.out.println(ma.values());
		System.out.println(ma.get("Akash"));
		System.out.println(ma);
		ma.remove(ma);

		System.out.println(ma.entrySet());

	}

}
