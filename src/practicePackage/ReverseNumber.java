package practicePackage;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		
		//Using algorithm
		
//		int rev = 0;
//		int rem;
//		
//		while(num > 0)
//		{
//			rem = num % 10;
//			rev = rev * 10 + rem;
//			num = num /10;
//		}
//		
//		System.out.println("Number in reverse is equal to : " + rev);
		
		//Using string buffer class method
		
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		System.out.println(sb.reverse());
		
		//Using String builder method
		StringBuilder sb1 = new StringBuilder(String.valueOf(num));
		System.out.println(sb1.reverse());
	}

}
