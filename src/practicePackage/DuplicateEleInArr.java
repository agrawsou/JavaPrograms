package practicePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateEleInArr {

	public static void main(String[] args) {
		
		 String arr[] = {"java","c","c++","python","java","python"};
		 
		 //Logic
		 
		 for(int i=0;i<arr.length;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]==arr[j]) {
					 System.out.println("Duplicate Element is : " + arr[i]);
				 }
			 }
		 }
		 
		 //Hashset
		 
		 Set<String> hs = new HashSet<String>();
		 for(String a : arr) {
		 if(!hs.add(a)) {
			 System.out.println("Found Duplicate Element : " + a);
		 }
		 }
		 

	}

}
