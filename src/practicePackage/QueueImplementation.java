package practicePackage;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImplementation {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new PriorityQueue<Integer> ();
		queue.add(50);
		queue.add(20);
		queue.add(35);
		
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		System.out.println(queue);

	}

}
