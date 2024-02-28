package practicePackage;

public class CountEvenAndOdd {

	public static void main(String[] args) {

		int num = 145678;
		
		int evenCount = 0;
		int oddCount = 0;
		int rem;
		
		while(num>0) {
			rem = num%10;
			if(rem%2 == 0) {
				evenCount++;
			}else {
				oddCount++;
			}
			num=num/10;
		}
		
		System.out.println("Odd Count: " + oddCount);
		System.out.println("Even Count: " + evenCount);

	}

}
