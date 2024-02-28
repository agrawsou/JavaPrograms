package practicePackage;

public class CountCharOccurence {

	public static void main(String[] args) {
		
		String s = "Java Programming Java oops";
		
		int totalCount = s.length();
		int totalAfterRemoval = s.replaceAll("a", "").length();
		
		int count = totalCount - totalAfterRemoval;
		
		System.out.println("Number of occurences of a : "+count);

	}

}
