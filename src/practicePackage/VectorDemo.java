package practicePackage;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Integer> myVector = new Vector<Integer>();
		
		myVector.add(2);
		myVector.add(4);
		myVector.add(6);
		myVector.add(8);
		myVector.add(10);
		myVector.add(12);
		myVector.add(14);
		myVector.add(16);
		
		System.out.println(myVector.get(3));
		
		myVector.remove(3);
		
		System.out.println(myVector.get(3));
	}
}
