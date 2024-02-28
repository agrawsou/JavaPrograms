package practicePackage;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String s = "Welcome to Java";
		String arr[] = s.split(" ");
		String rev = "";
		
		for(String a : arr) {
			StringBuffer sb = new StringBuffer(a);
			StringBuffer reversedString = sb.reverse();
			rev = rev + reversedString + " ";
		}
		
		System.out.println("Reversed string : "+rev);

	}

}
