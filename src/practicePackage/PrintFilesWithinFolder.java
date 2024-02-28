package practicePackage;

import java.io.File;
import java.util.Arrays;

public class PrintFilesWithinFolder {

	public static void main(String[] args) {
		
		File file = new File("C:\\D_Drive");
		File fi[] = file.listFiles();
		Arrays.parallelSort(fi);
		
		for(File f : fi) {
			if(f.isFile()) {
				System.out.println("File : " + f.getName());
			}else if(f.isDirectory()){
				System.out.println("Directory : " + f.getName());
			}else {
				System.out.println("Not known : " + f.getName());
			}
		}

	}

}
