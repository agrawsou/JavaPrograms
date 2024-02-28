package practicePackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args) {
		String path = "C:\\D_Drive\\Financials\\sample.txt";
		
		File file = new File(path);
		try {
			boolean flag = file.createNewFile();
			if(flag) {
				System.out.println("File created");
			}else {
				System.out.println("File not created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Fileoutput stream
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name with location path: ");
		String fileName = sc.nextLine();
		
		FileOutputStream op = new FileOutputStream(fileName,true);
		
		System.out.println("Enter file content : ");
		String content = sc.nextLine();
		byte b[] = content.getBytes();
		op.write(b);
		op.close();

		System.out.println("File is saved");
	}catch(Exception e) {
		System.out.println("Exception is coming");
	}
	}

}
