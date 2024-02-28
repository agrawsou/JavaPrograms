package practicePackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMethods {

	public static void main(String[] args) {

		LinkedList<String> names = new LinkedList<String>();

		names.add("Tom");
		names.add("Naveen");
		names.add("Robby");
		names.add("Lisa");

		System.out.println(names);
		System.out.println(names.size());
		System.out.println(names.get(0));

		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		names.add(4, "Steve");

		System.out.println(names);

		names.add(2, "Ram");

		System.out.println(names);
		
		Collections.sort(names, Collections.reverseOrder());
		System.out.println(names);

		LinkedList<String> users = new LinkedList<String>();
		users.add("Peter");
		users.add("Trump");

		users.addAll(names);

		System.out.println(users);

		users.addFirst("Sourabh");
		users.addLast("Shivit");

		System.out.println(users);

		users.remove(2);

		System.out.println(users);

		users.removeAll(names);

		System.out.println(users);

		users.removeFirst();
		users.removeLast();
		System.out.println(users);

		users.clear();
		System.out.println(users);
		
		

	}

}
