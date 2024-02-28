package practicePackage;

public class RemoveJunkOrSpecialChars {

	public static void main(String[] args) {
		String s = "$#%#$^&$%& latin string 01254589";
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);

	}

}
