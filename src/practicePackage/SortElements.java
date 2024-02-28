package practicePackage;

import java.util.Arrays;
import java.util.Collections;

public class SortElements {

	public static void main(String[] args) {
		Integer a[] = {4,2,1,5,3};
		System.out.println("Arrays before sorting : " + Arrays.toString(a));
		
		Arrays.parallelSort(a);
		
		System.out.println("Arrays after sorting : " + Arrays.toString(a));
		
		Arrays.sort(a,Collections.reverseOrder());
		
		System.out.println("Arrays after sorting : " + Arrays.toString(a));



	}

}
