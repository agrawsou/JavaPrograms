package practicePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPDFFile {

	public static void main(String[] args) {
		copyFile();		
	}
	
	public static void copyFile() {
		File file = new File("C:\\D_Drive\\Financials\\LTI Form 16 - Part A.pdf");
		File opFile = new File("C:\\D_Drive\\Financials\\LTI Form 16 - Part C.pdf");

		FileInputStream fi = null;
		FileOutputStream fo = null;

		try {
			fi = new FileInputStream(file);
			fo = new FileOutputStream(opFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		int i = 0;
		try {
			while ((i = fi.read()) != -1) {
				fo.write(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				if (fi != null) {
					fi.close();
					if (fo != null) {
						fo.close();
					}
				}
			} catch (IOException e) {	
				e.printStackTrace();
			}
		}
	}
}
