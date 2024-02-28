package practicePackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountOFEachDigit {

	public static void main(String[] args) {
		
		int num = 10877801;
		int rem;
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		while(num>0) {
			rem = num%10;
			if(m.containsKey(rem)) {
				m.put(rem, m.get(rem)+1);
			}else {
				m.put(rem, 1);
			}
			
			num = num/10;
		}
		
		for(Entry<Integer,Integer> e : m.entrySet()) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}

	}

}
