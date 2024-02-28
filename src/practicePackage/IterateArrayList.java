package practicePackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateArrayList {

	public static void main(String[] args) {
		
		List<String> li = new ArrayList<String>();
		li.add("Game of thrones");
		li.add("Breaking bad");
		li.add("Big bang theory");
		li.add("The walking dead");
		li.add("Prison Break");
		
		li.forEach((e) -> {
			System.out.println(e);
		});
		
		System.out.println("-------------------------------");
		
		Iterator<String> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("-------------------------------");
		
		for(String s : li) {
			System.out.println(s);
		}
		
		System.out.println("-------------------------------");
		
		li.stream().forEach(e -> System.out.println(e));
		
		
	}

}
