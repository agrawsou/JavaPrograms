package practicePackage;

public class Factorial {
	
	public int factorial(int num) {
		if(num==0)
			return 1;
		else
			return num*factorial(num-1);
	}

	public static void main(String[] args) {
		
//		int num = 5;
//		int fact = 1;
//		for(int i=num;i>=1;i--) {
//			fact = fact * i;
//		}
		
		Factorial f = new Factorial();
		
		System.out.println("Factorial of the number is : " + f.factorial(10));

	}

}
