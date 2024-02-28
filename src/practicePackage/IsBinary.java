package practicePackage;

public class IsBinary {
	
	public static boolean checkBinary(int num) {
		boolean flag = true;
		while(num!=0) {
			if((num%10)>1) {
				flag = false;
				break;
			}else {
				num = num/10;
			}
		}
		return flag;
	}

	public static boolean checkBinaryNew(int num) {
		boolean flag = String.valueOf(num).matches("[0-1]+");
		return flag;
	}
	
	public static void main(String[] args) {
		System.out.println(checkBinary(110010101));
		System.out.println(checkBinaryNew(110010108));

	}

}
