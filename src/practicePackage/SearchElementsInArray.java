package practicePackage;

public class SearchElementsInArray {

	public static void main(String[] args) {
		
		int a[] = {10,20,40,50,30};
		int ele = 100;
		boolean flag = false;
		
		for(int i=0;i<a.length;i++) {
			if(a[i] == ele) {
				System.out.println("Element is found at : " + i);
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("Element is not found");
		}

	}

}
