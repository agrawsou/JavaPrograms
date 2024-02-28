package practicePackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("Tom",1,90,15);
		Student s2 = new Student("Peter",2,80,16);
		Student s3 = new Student("Lisa",3,95,17);
		Student s4 = new Student("Robby",4,100,15);
		Student s5 = new Student("Sourabh",5,50,14);
		
		//add all the student objects in list
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		
		for(Student s : studentList) {
			System.out.println(s);
		}
		
		studentList.stream().forEach(e -> System.out.println(e));
		
		studentList.stream().filter(e -> e.getMarks()>80).forEach(e -> System.out.println(e.getName() + " - " + e.getMarks()));
		
//		Map<String,Integer> li = new HashMap<String,Integer>();
//		for(Student s : studentList) {
//			li.put(s.getName(), s.getMarks());
//		}
//		Integer max = Collections.max(li.values());
//		
//		for(Entry<String,Integer> e : li.entrySet()) {
//			if(e.getValue() == max) {
//				System.out.println("Name of the employee is : " + e.getKey());
//			}
//		}
		
		List<Integer> li = new ArrayList<Integer>();
		for(Student s : studentList) {
			li.add(s.getMarks());
		}
		
		Integer maxMarks = Collections.max(li);
		
		for(Student s : studentList) {
			if(s.getMarks() == maxMarks) {
				System.out.println(s.getName());
				break;
			}
		}
		
		
		
		

	}

}
