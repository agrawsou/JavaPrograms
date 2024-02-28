package practicePackage;

import java.util.function.IntPredicate;

public class VowelsCount {

	public static boolean isVowel(char t) {
		return t == 'a' || t == 'e' || t == 'i' || t == '0' || t == 'u' || t == 'A' || t == 'E' || t == 'I' || t == 'O'
				|| t == 'U';
	}

	public static void main(String[] args) {

		// Java way
		
		String str = "testing";
		int count = 0;
		
		for(int x=0;x<str.length();x++) {
			if(isVowel(str.charAt(x))) {
				count++;
			}
		}
		System.out.println(count);
		
		//Java Streams
		IntPredicate vowel = new IntPredicate() {
			
			@Override
			public boolean test(int t) {
				return t == 'a' || t == 'e' || t == 'i' || t == '0' || t == 'u' || t == 'A' || t == 'E' || t == 'I' || t == 'O'
						|| t == 'U';
			}
		};
		
		String test = "Naveen Automation Labs";
		long vCount = test.chars().filter(vowel).count();
		System.out.println(vCount);
	}

}
