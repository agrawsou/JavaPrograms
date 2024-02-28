package practicePackage;

import java.util.Random;
import java.util.UUID;

public class RandomNumbersAndStrings {

	public static void main(String[] args) {
		 Random rand = new Random();
		 System.out.println(rand.nextInt(10000));
		 System.out.println(rand.nextDouble(10000));
		 
		 System.out.println(Math.random());
	}

}
