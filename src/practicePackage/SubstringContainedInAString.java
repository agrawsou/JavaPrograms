package practicePackage;

import java.io.InputStream;
import java.util.stream.IntStream;

public class SubstringContainedInAString {

	public static void main(String[] args) {
		
		String str = "Hello && World";
		String substr = "&&";
		
		if(str.contains(substr)) {
			System.out.println("String is present");
		}else {
			System.out.println("Not present");
		}
		
		IntStream.range(1, 101).forEach(e -> System.out.println(e));

	}

}
