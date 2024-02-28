package practicePackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashmapToArrayList {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Google", 10000);
		hm.put("Walmart", 20000);
		hm.put("Amazon", 30000);
		hm.put("Facebook", 5000);
		hm.put("Cisco", 15000);
		
		
		List<String> keyList = new ArrayList<String>();
		
		for(String key : hm.keySet()){
			keyList.add(key);
		}
		
		System.out.println(keyList);
		
		List<Integer> empValuesList = new ArrayList<Integer>();
		
		for(String key : hm.keySet()){
			Integer value = hm.get(key);
			empValuesList.add(value);
		}
		
		System.out.println(empValuesList);
		

	}

}
