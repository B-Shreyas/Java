package lambdaExpression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StudentMainList {

	public static void main(String args[]) {
		
		ArrayList<Student> studentList = new ArrayList<>();
		
		Student student1 = new Student(10,"Hari",80);
		Student student2 = new Student(1,"Ankush",50);
		Student student3 = new Student(11,"Rishi",30);
		Student student4 = new Student(2,"Sam",20);
		Student student5 = new Student(3,"Shreyas",90);
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		
		System.out.println("*********************************");
		System.out.println("Before Sorting");
		System.out.println("**********************************");
		System.out.println(studentList);
		System.out.println("**********************************");
		
		Collections.sort(studentList, new StudentSort());
		
		System.out.println();
		
		System.out.println("***********************************");
		System.out.println("After Sorting");
		System.out.println("**********************************");
		System.out.println(studentList);
		System.out.println("**********************************");
		
	}
	
}
