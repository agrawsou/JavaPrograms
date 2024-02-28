package practicePackage;

public class CountOccurenceUsingStreams {

	public static void main(String[] args) {
		String str = "Testing solutions";
		
		long count = str.chars().filter(e -> (char)e == 'i').count();
		System.out.println(count);
	}

}
