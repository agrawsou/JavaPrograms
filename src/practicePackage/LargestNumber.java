package practicePackage;

public class LargestNumber {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 30;
		int c = 40;
		
		int largest;
		
//		if(a>b && a>c) {
//			System.out.println(a + " is largest number");
//		}else if(b>a && b>c) {
//			System.out.println(b + " is largest number");
//		}else {
//			System.out.println(c + " is largest number");
//		}
		
		//Using ternary operator
		largest = a>b?a:b;
		largest = c>largest?c:largest;
		
		System.out.println("Largest number is : " + largest);
		

	}

}
