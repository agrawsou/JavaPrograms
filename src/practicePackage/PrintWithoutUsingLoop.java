package practicePackage;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrintWithoutUsingLoop {

	public static void main(String[] args) {
		
		IntStream.range(1, 101).forEach(e -> System.out.println(e));
		System.out.println("-----------------");
		printNum(5,100);

	}
	
	public static void printNum(int startNum, int endNum) {
		if(startNum<=endNum) {
			System.out.println(startNum);
			startNum++;
			printNum(startNum,endNum);
		}
	}

}
