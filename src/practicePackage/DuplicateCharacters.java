package practicePackage;

import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String input = "Automation";

		input = input.toLowerCase();

		char c[] = input.toCharArray();

		HashMap <Character,Integer> hm = new HashMap<Character,Integer>();

		for(Character z : c){
		Integer count = hm.get(z);
		if(hm.containsKey(z)){
		hm.put(z,++count);
		}else{
		hm.put(z,1);
		}
		}

		for(Entry<Character, Integer> e : hm.entrySet()){
		System.out.print(e.getKey() + "-" + e.getValue() + ",");
		}

	}

}
