package practicePackage;

import java.util.HashSet;

public class RemoveStringsFromArray {

	public static void main(String[] args) {
		
		int num[] = {2,2,4,4,5,5,6,6};
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(Integer a : num) {
			hs.add(a);
		}
		
		hs.stream().forEach(e -> System.out.println(e));

	}

}
