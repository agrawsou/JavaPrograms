package practicePackage;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMap {

	public static void main(String[] args) {
		
		Map<String, Integer> hm = new java.util.LinkedHashMap<String, Integer>();
		hm.put("Google", 10000);
		hm.put("Walmart", 20000);
		hm.put("Amazon", 30000);
		hm.put("Facebook", 5000);
		hm.put("Cisco", 15000);
		
		System.out.println(hm);
		

	}

}
