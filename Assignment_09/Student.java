package collection_iterator;

import java.util.Objects;

public class Student implements Comparable<Student> {
	int rollNo;
	String name;
	double marks;
	public Student(int rollNo, String name, double marks) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	public Student() {
	
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student arg0) {
		int value = Integer.compare(this.rollNo, arg0.rollNo);
		return value;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollNo == other.rollNo;
	}

	
	

}
