package practicePackage;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {

		Map<String, Integer> marks = new Hashtable<String, Integer>();
		marks.put("Naveen", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Peter", 400);
		marks.put("Robby", 500);

		System.out.println(marks.get("Naveen"));
	}

}
