package assignment;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class Student{

	private String name;
	private int marks;
	private int age;
	
	public Student(String name, int marks, int age) {
		super();
		this.name = name;
		this.marks = marks;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", age=" + age
				+ "]";
	}
	
}

public class TestStudent{
	
	public static void main (String[] args){
		
		ArrayList<Student> arrayList = new ArrayList<>();
		
		arrayList.add(new Student("Arav",69,23));
		arrayList.add(new Student("Vijay",34,27));
		arrayList.add(new Student("Ajith",97,26));
		
		System.out.println(arrayList);
		//ageComparator method
		Collections.sort(arrayList,(c1,c2)->{
			
//			if(c1.getAge()>c2.getAge()){
//				return 1;
//			}else if(c1.getAge()<c2.getAge()){
//				return -1;
//			}
//			return 0;
			return c1.getMarks()>c2.getMarks()?1:-1;
		}
				);
		System.out.println(arrayList);
		
		
		
		
		
	}
	
}
