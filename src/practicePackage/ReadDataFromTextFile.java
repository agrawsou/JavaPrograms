package practicePackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		
		//File Reader and Buffered Reader
//		FileReader fr = new FileReader("C:\\D_Drive\\Interview Docs\\Interview Questions.txt");
//		BufferedReader br = new BufferedReader(fr);
//		
//		String str;
//		
//		while((str=br.readLine())!=null) {
//			System.out.println(str);
//		}
//		
//		br.close();
		
		//Using scanner and file
		
		File file = new File("C:\\D_Drive\\Interview Docs\\Interview Questions.txt");
		
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

	}

}
