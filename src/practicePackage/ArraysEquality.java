package practicePackage;

import java.util.Arrays;

public class ArraysEquality {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,10};
		int b[] = {1,2,3,4,5};
		
		boolean flag = false;
		
		if(a.length == b.length) {
			for(int i=0;i<a.length;i++) {
				if(a[i]==b[i]) {
					flag = true;
				}else {
					flag = false;
				}
			}
			
		}else {
			flag = false;
		}
		
		if(flag) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Array are not equal");
		}

	}

}
