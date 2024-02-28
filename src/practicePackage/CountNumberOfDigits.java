package practicePackage;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		int num = 45896554;
//		int count = 0;
//		
//		while(num>0) {
//			count++;
//			num = num/10;
//		}
//		
//		System.out.println(count);
		
		String convertedNum = String.valueOf(num);
		System.out.println(convertedNum.length());

	}

}
