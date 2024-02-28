package practicePackage;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,4,5,6,8,9,10};
		int sumOfArray = 0;
		int totalSum = 0;
		
		for(int m : a) {
			sumOfArray = sumOfArray+m;
		}
		
		for(int i=1;i<=10;i++) {
			totalSum = totalSum+i;
		}
		
		System.out.println("Missing element is : " + (totalSum-sumOfArray));

	}

}
