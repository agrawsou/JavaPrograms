package practicePackage;

import java.util.Arrays;
import java.util.Comparator;

public class SearchEleInArrBinary {

	public static void main(String[] args) {
		int a[] = {20,50,30,10,40,70,60,90,80,100};
		int searchElement = 120;
		boolean flag = false;
		Arrays.sort(a);
		
		int start = 1;
		int end = a.length-1;
		
		while(start<=end) {
			int mid = (start+end)/2;
			if(searchElement == a[mid]) {
				System.out.println("Element is found at : " + mid);
				flag = true;
				break;
			}else if(searchElement > a[mid]) {
				start = mid+1;
			}else if(searchElement < a[mid]) {
				end = mid-1;
			}
		}
		
		if(flag==false) {
			System.out.println("Element is not found");
		}
		
		System.out.println(Arrays.binarySearch(a, 70));
		
		
		
		
		

	}

}
