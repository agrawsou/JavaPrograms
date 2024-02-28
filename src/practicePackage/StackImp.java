package practicePackage;

import java.util.Stack;

public class StackImp {
	
	public static void main(String args[]) {
		
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(1);
		st.push(2);
		st.push(3);
		
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.isEmpty());
	}
		

	

}
