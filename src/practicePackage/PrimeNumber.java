package practicePackage;

public class PrimeNumber {

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		if(isPrime(24)){
			System.out.println("Prime number");
		}else{
			System.out.println("Not prime number");
		};
	
	for(int i = 2;i<=20;i++) {
		if(isPrime(i)) {
			System.out.print(i + " ");
		}
	}

}
}
