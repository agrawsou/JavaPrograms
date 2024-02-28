package practicePackage;

public class ReverseString {

	public static void main(String[] args) {


		//Using concatenation
		
		String str = "automation";
//		String rev = "";
//		for(int i=str.length()-1; i>=0;i--) {
//			rev = rev + str.charAt(i);
//		}
//		System.out.println(rev);
		
		//Using stringbuffer
		
//		StringBuffer sb = new StringBuffer(str);
//		System.out.println(sb.reverse());
		
		//Using String builder
		StringBuilder sbr = new StringBuilder(str);
		System.out.println(sbr.reverse());
		

	}

}
