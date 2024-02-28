package practicePackage;

import java.util.Arrays;

public class Anagram {

	public static void isAnagram(String str1, String str2) {
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");
		
		char c1[] = str1.toLowerCase().toCharArray();
		char c2[] = str2.toLowerCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
	
		if(Arrays.equals(c1, c2)) {
			System.out.println("Is Anagram");
		}else {
			System.out.println("Not Anagram");
		}

	}

	public static void main(String[] args) {
		isAnagram("listen", "Silent");
		isAnagram("listen", "Silentty");

	}

}
