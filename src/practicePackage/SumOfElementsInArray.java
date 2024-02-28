package practicePackage;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		
		int num[] = {5,2,7,9,6};
		
		int sum = 0;
		
		for(int a : num) {
			sum = sum + a;
		}
		
		System.out.println(sum);

	}

}
