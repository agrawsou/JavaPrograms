package practicePackage;

import java.util.Arrays;

public class MinNumberOfPlatforms {

	public static void main(String[] args) {
		int arr[] = {900, 940, 950, 1100, 1500, 1800};
		 int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
		 int n=6;
		 
		 Arrays.sort(arr);
		 Arrays.sort(dep);
		 int plat_need = 1, result = 1;
		 int i=1,j=0;
		 while(i<n && j<n) {
			 if(arr[i]<=dep[j]) {
				 plat_need++;
				 i++;
			 }
			 else if(arr[i]>dep[j]) {
				 plat_need--;
				 j++;
			 }
			 
			 if(plat_need>result) {
				 result = plat_need;
			 }
		 }
		 
		 System.out.println(result);

	}

}
