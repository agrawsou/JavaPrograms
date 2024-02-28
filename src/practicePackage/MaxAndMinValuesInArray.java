package practicePackage;

public class MaxAndMinValuesInArray {

	public static void main(String[] args) {

		int a[] = { 50, 30, 40, 20, 60 ,80,50};
		
		int max = a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		
		System.out.println("Max value in the array is : " + max);

	}

}
