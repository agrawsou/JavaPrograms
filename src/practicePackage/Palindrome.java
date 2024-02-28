package practicePackage;

public class Palindrome {

	public static void main(String[] args) {
		
		String str = "Madam";
		
		String originalStr = str;
		String rev = "";
		
		for(int i = str.length()-1; i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		
		if(rev.equalsIgnoreCase(originalStr)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		

	}

}
