package practicePackage;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Average {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,3,2,3,4};
		int sum = 0;
		int average;
		for(int ele : a) {
			sum = sum+ele;
		}
		
		average = (sum/a.length);
		System.out.println("Average of the elements of array is : "+average);
		
		//Java Stream
		
		OptionalDouble db = Arrays.stream(a).average();
		System.out.println(db.getAsDouble());
		
		

	}

}
