package practicePackage;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 156;
		int original = num;
		int rem;
		int sum = 0;
		
		while(num>0) {
			rem = num%10;
			sum = sum + rem*rem*rem;
			num = num/10;
		}
		
		if(sum == original) {
			System.out.println("Armstrong mumber");
		}else {
			System.out.println("Not Armstrong mumber");
		}
		
	
	
	}

}
