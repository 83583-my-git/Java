package collection_iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(104,"tantanu",35));
		list.add(new Student(102,"happy",85));
		list.add(new Student(105,"ganni",48));
		list.add(new Student(103,"anti",95));
		list.add(new Student(101,"pari",100));
		
		System.out.println("arraylist before sort ");
		for(Student element : list)
		{
			System.out.println(element);
			
		}
			
		Collections.sort(list);
		System.out.println("********arraylist After sort ***********");
		for(Student element : list)
		{
			System.out.println(element);
			
		}
		System.out.println("********sorting on student name***********");
		class CompareStudentName implements Comparator<Student>{

		
			@Override
			public int compare(Student arg0, Student arg1) {
				int value = arg0.getName().compareTo(arg1.getName());
				
				return value;
			}
			
		}
		Comparator<Student> cname = new CompareStudentName();
		Collections.sort(list, cname);
		
		for(Student element : list)
		{
			System.out.println(element);
			
		}
		Student std = new Student();
		std.setRollNo(101);
		//std.rollNo = 101;
		if(list.contains(std))
		{
			System.out.println("student exist ");
		}
		else {
			System.out.println("student dose not exist ");
		}
	
			
			

			
		}
		
		
	}

