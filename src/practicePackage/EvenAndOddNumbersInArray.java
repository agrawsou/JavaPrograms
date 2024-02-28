package practicePackage;

public class EvenAndOddNumbersInArray {

	public static void main(String[] args) {
		
		int num[] = {5,2,7,9,6};
		System.out.println("Even numbers in array");
		for(int a : num) {
			if(a%2==0) {
				System.out.println(a);
			}
		}
		
		System.out.println("Odd numbers in array");
		for(int a : num) {
			if(a%2!=0) {
				System.out.println(a);
			}
		}
	

	}

}
