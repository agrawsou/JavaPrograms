package practicePackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

	public static void main(String[] args) {
		
		Map<String,String> hm = new HashMap<String,String>();
		hm.put("1","Naveen");
		hm.put("2","Tom");
		hm.put("3","Lisa");
		
		Map<String,String> syncMap = Collections.synchronizedMap(hm);
		System.out.println(syncMap);
		
		ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<String, String>();
		chm.put("A", "Java");
		chm.put("B", "Python");
		chm.put("C", "Ruby");
		chm.put(null, "Test");
		
		System.out.println(chm.get("A"));

	}

}
