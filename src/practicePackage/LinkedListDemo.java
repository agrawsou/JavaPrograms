package practicePackage;

public class LinkedListDemo {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
		
	}

	public static void main(String[] args) {
		
		LinkedListDemo ln = new LinkedListDemo();
		Node first = ln.new Node(10);
		
		ln.head = first;
		
		Node second = ln.new Node(20);
		first.next = second;
		

	}

}
