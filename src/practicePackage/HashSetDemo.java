package practicePackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		Set<String> hs = new HashSet<String>();

		hs.add("alpha");
		hs.add("testing");
		hs.add("beta");
		hs.add("alpha");
		hs.add("alpha");
		hs.add(null);
		System.out.println(hs);

		System.out.println(hs.contains("testing"));

		for (String s : hs) {
			System.out.println(s);
		}

		Set<Integer> first = new HashSet<Integer>();

		first.addAll(Arrays.asList(new Integer[] { 1, 3, 4, 5, 6, 8, 9, 10 }));

		Set<Integer> second = new HashSet<Integer>();

		second.addAll(Arrays.asList(new Integer[] { 1, 3, 5, 6, 0, 9 }));
		
		Set<Integer> union = new HashSet<Integer>(first);
		
		union.addAll(second);
		
		System.out.println(union);
		
		Set<Integer> intersection = new HashSet<Integer>(first);
		
		intersection.retainAll(second);
		
		System.out.println(intersection);
		
		Set<Integer> diff = new HashSet<Integer>(first);
		diff.removeAll(second);
		
		System.out.println(diff);

	}

}
