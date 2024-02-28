package practicePackage;

import java.io.IOException;

public class LaunchDesktopApps {

	public static void main(String[] args) throws InterruptedException, IOException {
		Runtime time = Runtime.getRuntime();
		try {
			Process pr = time.exec("notepad.exe");
			Thread.sleep(2000);
			pr.destroy();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String str[] = {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe","https://www.amazon.com"};
		time.exec(str);
	}

}
